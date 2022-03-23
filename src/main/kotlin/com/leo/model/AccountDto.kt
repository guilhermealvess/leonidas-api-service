package com.leo.model

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import java.io.Serializable

@Entity
data class AccountDto(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false)
    val firstName: String? = null,

    @Column(nullable = false)
    val lastName: String? = null,

    @Column(nullable = false)
    val birthDate: String? = null,

    @Column(nullable = false)
    val email: String? = null,

    @Column(nullable = false)
    val username: String? = null,

    @Column(nullable = true)
    val lastLogin: Date? = null,

    @Column(nullable = false)
    val documentNumber: String? = null,

    @Column(nullable = false)
    val phoneNumber: String? = null,

    @Column(nullable = false)
    val createdAt: Date? = null,

    @Column(nullable = false)
    val createdBy: String? = null,

    @Column(nullable = true)
    val updatedAt: Date? = null,

    @Column(nullable = true)
    val updatedBy: String? = null

): Serializable