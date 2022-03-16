package com.leo.controller.schema

class LoginRequestSchema {
    private var username: String = ""

    private var password: String = ""

    fun getUsername() = username

    fun getPassword() = password
}

class LoginResponseSchema(token: String, msgError: String) {
    var token = token
    var msgError = msgError
}