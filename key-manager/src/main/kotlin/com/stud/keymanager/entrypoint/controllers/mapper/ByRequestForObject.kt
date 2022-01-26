package com.stud.keymanager.entrypoint.controllers.mapper

import com.stud.keymanager.domain.entities.Key
import com.stud.keymanager.domain.entities.TypeAccount
import com.stud.keymanager.domain.entities.TypeKey
import com.stud.keymanager.entrypoint.controllers.dto.request.KeyRequest

fun KeyRequest.parse() : Key {
    return Key(
        identifierClient = this.identifierClient,
        typeKey = TypeKey.valueOf(this.typeKey),
        valueKey = this.valueKey,
        typeAccount = TypeAccount.valueOf(this.typeAccount)
    )
}