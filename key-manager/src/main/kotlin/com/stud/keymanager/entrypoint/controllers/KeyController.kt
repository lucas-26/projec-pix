package com.stud.keymanager.entrypoint.controllers

import com.stud.keymanager.entrypoint.controllers.dto.request.KeyRequest
import com.stud.keymanager.entrypoint.controllers.mapper.parse
import com.stud.keymanager.usecase.createKeyUseCase.CreateKey
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import javax.validation.Valid

@RestController
@RequestMapping("/Keys")
@Validated
class KeyController(
    @Autowired
    private val createKeyPort: CreateKey
) {

    @PostMapping
    fun createKey(@RequestBody
                  @Valid
                  keyReq: KeyRequest): ResponseEntity<String> {

        try {
            val keyCreated = createKeyPort.execute(keyReq.parse())
            val location  = URI.create("http:localhost:8080/Keys/id")

            return ResponseEntity
                .created(location)
                .body("The key with id: $keyCreated were created.")
        } catch (e: Exception){
            e.printStackTrace()
            throw e
        }
    }
}