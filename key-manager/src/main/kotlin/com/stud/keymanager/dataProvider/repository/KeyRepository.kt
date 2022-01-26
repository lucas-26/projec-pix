package com.stud.keymanager.dataProvider.repository

import com.stud.keymanager.dataProvider.entity.KeyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface KeyRepository : JpaRepository<KeyEntity, Long> {
}