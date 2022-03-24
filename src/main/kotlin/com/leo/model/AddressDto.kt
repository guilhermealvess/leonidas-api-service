package com.leo.model

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import java.io.Serializable

@Entity
data class AddressDto(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, name = "FK_ACCOUNT_ID")
    val accountId: Long? = null,

    @Column(nullable = false, name = "PUBLIC_PLACE")
    val publicPlace: String? = null,

    @Column(nullable = false, name = "HOME_NUMBER")
    val homeNumber: String? = null,

    @Column(nullable = true, name = "FULLFILMENT")
    val fullfilment: String? = null,

    @Column(nullable = false, name = "DISTRICT")
    val district: String? = null,

    @Column(nullable = false, name = "CITY")
    val city: String? = null,

    @Column(nullable = false, name = "CEP")
    val cep: String? = null,

    @Column(nullable = false, name = "STATE_UF")
    val stateUf: String? = null,

    @Column(nullable = false, name = "CREATED_AT")
    val createdAt: Date? = null,

    @Column(nullable = false, name = "CREATED_BY")
    val createdBy: String? = null,

    @Column(nullable = true, name = "UPDATED_AT")
    val updatedAt: Date? = null,

    @Column(nullable = true, name = "UPDATED_BY")
    val updatedBy: String? = null

): Serializable