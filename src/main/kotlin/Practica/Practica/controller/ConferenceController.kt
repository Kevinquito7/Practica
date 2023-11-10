package Practica.Practica.controller

import Practica.Practica.model.Conference
import Practica.Practica.service.conferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/conference")   //endpoint
class ConferenceController {
    @Autowired

    lateinit var conferenceService: conferenceService

    @GetMapping
    fun list ():List <Conference>{
        return conferenceService.list()
    }

    @PostMapping
    fun save (@RequestBody conference: Conference):ResponseEntity<Conference>{
        return ResponseEntity(conferenceService.save(conference), HttpStatus.OK)
    }

}
