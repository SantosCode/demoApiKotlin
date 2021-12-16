package br.com.vr.demoapikotlin.resource

import br.com.vr.demoapikotlin.model.Usuario
import br.com.vr.demoapikotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("exemple")
class UserResource {
    @Autowired
    private lateinit var service: UserService

    @GetMapping("/users")
    fun getUsers(): List<Usuario> = service.getUsers()

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable("id") id: Long): Usuario = service.getUser(id)

    @PostMapping("/users")
    fun addUser(@RequestBody user: Usuario): Usuario {
        return service.addUser(user)
    }

    @DeleteMapping("/users/{id}")
    fun deleteUser(@PathVariable("id") id: Long) = service.deleteUser(id)
}
