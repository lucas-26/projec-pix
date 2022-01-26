package com.stud.keymanager.dataProvider.gateway

import com.stud.keymanager.dataProvider.entity.KeyEntity

interface AuthorGateway {

    fun saveKey(key: KeyEntity) : String

}