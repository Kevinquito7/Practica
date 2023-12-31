package Practica.Practica.repository

import Practica.Practica.model.Conference
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

    @Repository
    interface ConfereceRepository : JpaRepository<Conference, Long?> {

        fun findById (id: Long?): Conference?


    }
