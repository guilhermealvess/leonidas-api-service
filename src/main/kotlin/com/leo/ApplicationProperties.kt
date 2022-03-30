package com.leo

import io.micronaut.context.annotation.ConfigurationProperties
import javax.validation.constraints.NotBlank

@ConfigurationProperties("api-auth-jwt")
class ApplicationProperties {

    @NotBlank
    lateinit var host: String

    @NotBlank
    lateinit var port: String

    @NotBlank
    lateinit var credential: String

    @NotBlank
    lateinit var key: String

    @NotBlank
    lateinit var projectId: String

}