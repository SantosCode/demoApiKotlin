package br.com.vr.demoapikotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    var nome: String?,
    val email: String,
    val idade: Int
)
