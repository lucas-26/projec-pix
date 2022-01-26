package com.stud.keymanager.usecase.createKeyUseCase.impl

import com.stud.keymanager.dataProvider.gateway.AuthorGateway
import com.stud.keymanager.domain.entities.Key
import com.stud.keymanager.usecase.createKeyUseCase.CreateKey
import com.stud.keymanager.usecase.createKeyUseCase.mapper.parse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateKey(
    @Autowired
    val authorGateway: AuthorGateway
) : CreateKey{

    override fun execute(key: Key): String {
        return authorGateway.saveKey(key.parse())
    }
}