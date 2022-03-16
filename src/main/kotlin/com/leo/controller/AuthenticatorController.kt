package com.leo.controller

import com.leo.ApplicationProperties
import com.leo.auth.AuthtenticatorJWT
import com.leo.controller.schema.LoginRequestSchema
import com.leo.controller.schema.LoginResponseSchema

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.Produces

@Controller("/auth")
class AuthenticatorController(val applicationProperties: ApplicationProperties) {

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun login(loginSchema: LoginRequestSchema): HttpResponse<Any> {
        try {
            val signInResponse = AuthtenticatorJWT(applicationProperties).signIn( loginSchema.getUsername(), loginSchema.getPassword() )
            val status = if(signInResponse.success) 200 else 403

            return HttpResponse.ok<Any>(LoginResponseSchema(signInResponse.token, signInResponse.error)).status(status)
        } catch (e: Exception) {

            return HttpResponse.badRequest()
        }
    }

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun verify(@Header("AUTHORIZATION") authorization: String): MutableHttpResponse<Any>? {
        try {
            val user = AuthtenticatorJWT(applicationProperties).verify( authorization )

            return HttpResponse.ok<Any>(user).status(200)
        } catch (e: Exception) {

            return HttpResponse.badRequest()
        }
    }
}