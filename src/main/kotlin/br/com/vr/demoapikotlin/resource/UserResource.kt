package br.com.vr.demoapikotlin.resource

import br.com.vr.demoapikotlin.model.Usuario
import br.com.vr.demoapikotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("exemple")
class UserResource {
    @Autowired
    private lateinit var service: UserService

    @GetMapping("/users")
    fun getUsers(): ResponseEntity<List<Usuario>> {
        val users = service.getUsers()
//        return if (users.isEmpty()) ResponseEntity.noContent().build()
//        else ResponseEntity.ok(users)
        return when {
            users.isEmpty() -> ResponseEntity.noContent().build()
            else -> ResponseEntity.ok(users)
        }
    }

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable("id") id: Long): Usuario = service.getUser(id)

    @PostMapping("/users")
    fun addUser(@RequestBody user: Usuario): Usuario {
        return service.addUser(user)
    }

    @DeleteMapping("/users/{id}")
    fun deleteUser(@PathVariable("id") id: Long) = service.deleteUser(id)
}
