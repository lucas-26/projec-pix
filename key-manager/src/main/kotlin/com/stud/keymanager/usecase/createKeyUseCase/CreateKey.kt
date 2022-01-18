package com.stud.keymanager.usecase.createKeyUseCase

import com.stud.keymanager.domain.entities.Key

interface CreateKey {

    fun execute(key: Key) : String

}