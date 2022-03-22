package com.leo.controller.schema

class LoginRequestSchema(var username: String, var password: String)

class LoginResponseSchema(var token: String, var msgError: String)