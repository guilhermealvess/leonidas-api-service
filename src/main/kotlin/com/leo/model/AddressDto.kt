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

    @Column(nullable = false)
    val fkAccountId: Long? = null,

    @Column(nullable = false)
    val publicPlace: String? = null,

    @Column(nullable = false)
    val homeNumber: String? = null,

    @Column(nullable = true)
    val fullfilment: String? = null,

    @Column(nullable = false)
    val district: String? = null,

    @Column(nullable = false)
    val city: String? = null,

    @Column(nullable = false)
    val cep: String? = null,

    @Column(nullable = false)
    val stateUf: String? = null,

    @Column(nullable = false)
    val createdAt: Date? = null,

    @Column(nullable = false)
    val createdBy: String? = null,

    @Column(nullable = true)
    val updatedAt: Date? = null,

    @Column(nullable = true)
    val updatedBy: String? = null

): Serializable