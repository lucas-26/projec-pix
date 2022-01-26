package com.stud.keymanager.dataProvider.gateway

import com.stud.keymanager.dataProvider.entity.KeyEntity
import com.stud.keymanager.dataProvider.repository.KeyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AuthorGatewayImpl(
    @Autowired
    val repository: KeyRepository
) : AuthorGateway {

    override fun saveKey(key: KeyEntity): String {
        repository.save(key)
        return key.id.toString()
    }


}