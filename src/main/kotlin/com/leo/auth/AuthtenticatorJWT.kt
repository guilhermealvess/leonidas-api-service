package com.leo.auth

import com.leo.SigninRequest
import com.leo.ApplicationProperties
import com.leo.SigninReply
import com.leo.VerifyTokenRequest
import com.leo.AuthenticatorGrpcKt

import io.grpc.ManagedChannelBuilder

class AuthtenticatorJWT(val applicationProperties: ApplicationProperties){

    suspend fun signIn(username: String, password: String): SigninReply {
        val credential = applicationProperties.credential
        val apiKey = applicationProperties.key
        val stub = this.createNewStub()
        val request = SigninRequest.newBuilder().setCredential(credential).setKey(apiKey)
            .setEmail(username).setPassword(password).build()

        return stub.signIn( request )
    }

    suspend fun verify(token: String?): User {
        if(token == null) {
            throw RuntimeException("Token Authorization is required")
        }

        val stub = createNewStub()
        val request = VerifyTokenRequest.newBuilder().setToken(token).setProjectId(applicationProperties.projectId).build()
        val response = stub.verifyToken(request)
        if (!response.success){
            throw RuntimeException("")
        }

        return User(response.payload.id, response.payload.email)
    }

    private fun createNewStub(): AuthenticatorGrpcKt.AuthenticatorCoroutineStub {
        val apiHost = applicationProperties.host
        val apiPort = applicationProperties.port
        val channel = ManagedChannelBuilder.forAddress(apiHost, apiPort.toInt()).usePlaintext().build()

        return AuthenticatorGrpcKt.AuthenticatorCoroutineStub(channel)
    }
}