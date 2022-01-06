package br.com.vr.demoapikotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Usuario (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    var nome: String?,
    val email: String,
    val idade: Int,
) {
    var telefone: String? = null
    constructor(id: Long, nome: String?, email: String, idade: Int, telefone: String) : this(id, nome, email, idade) {
        this.telefone = telefone
    }
}


fun main() {
    val user = Usuario(1, "Nome", "EMail", 30)
    val user2 = Usuario(2, "Nome", "Email", 30, "011309078")
    println(user.toString())
    println("Telefone do usuario 2 ${user2.telefone}")
}
