package com.stud.keymanager.usecase.createKeyUseCase.mapper

import com.stud.keymanager.dataProvider.entity.KeyEntity
import com.stud.keymanager.domain.entities.Key

fun Key.parse(): KeyEntity {
    val key = KeyEntity()
    key.let {
        it.identifierClient = this.identifierClient
        it.typeKey = this.typeKey.name
        it.valueKey = this.valueKey
        it.typeAccount = this.typeAccount.name
    }
    return key
}

