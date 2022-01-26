package com.stud.keymanager.dataProvider.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType


@Entity(name = "Key_Pix")
class KeyEntity(
    var identifierClient: String = "",
    var typeKey: String = "",
    var valueKey: String = "",
    var typeAccount: String = ""
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
}