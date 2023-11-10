package Practica.Practica.service

import Practica.Practica.model.Conference
import Practica.Practica.repository.ConfereceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
@Service
class conferenceService {

    @Autowired
    lateinit var ConfereceRepository: ConfereceRepository

    fun list ():List<Conference>{
        return ConfereceRepository.findAll()
        }


        fun save(conference: Conference): Conference {
            try{
                return ConfereceRepository.save(conference)
            }
            catch (ex:Exception){
                throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
            }
        }

    }
