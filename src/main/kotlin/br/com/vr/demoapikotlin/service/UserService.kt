package br.com.vr.demoapikotlin.service

import br.com.vr.demoapikotlin.model.Usuario
import br.com.vr.demoapikotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val repository: UserRepository) {

    fun getUsers(): List<Usuario> = repository.findAll()

    fun getUser(id: Long): Usuario = repository.getById(id)

    fun addUser(user: Usuario): Usuario = repository.save(user)

    fun deleteUser(id: Long): Unit = repository.deleteById(id)
}
