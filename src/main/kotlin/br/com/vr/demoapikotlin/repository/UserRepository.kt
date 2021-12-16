package br.com.vr.demoapikotlin.repository

import br.com.vr.demoapikotlin.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<Usuario, Long> {}
