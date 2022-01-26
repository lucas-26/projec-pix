package com.stud.keymanager.domain.entities

data class  Key(val identifierClient: String,
                val typeKey: TypeKey,
                val valueKey: String,
                val typeAccount: TypeAccount
                )