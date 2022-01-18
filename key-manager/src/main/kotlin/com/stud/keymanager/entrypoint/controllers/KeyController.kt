package com.stud.keymanager.entrypoint.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/Keys")
class KeyController {

    @PostMapping
    fun createKey() {

    }

}