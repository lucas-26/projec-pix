package com.stud.keymanager.entrypoint.controllers.dto.request

import com.fasterxml.jackson.annotation.JsonFormat
import javax.validation.constraints.NotBlank

class KeyRequest(
    @field:JsonFormat(pattern = "identifier_client")
    @field:NotBlank(message = "The field identifier_client is required.")
    var identifierClient: String,
    @field:JsonFormat(pattern = "type_Key")
    @field:NotBlank(message = "The field type_Key is required.")
    var typeKey: String,
    @field:JsonFormat(pattern = "value_Key")
    @field:NotBlank(message = "The field value_Key is required.")
    var valueKey: String,
    @field:JsonFormat(pattern = "type_account")
    @field:NotBlank(message = "The field type_account is required.")
    var typeAccount: String
)