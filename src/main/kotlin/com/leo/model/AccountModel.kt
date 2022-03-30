package com.leo.model

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import java.io.Serializable
import javax.persistence.Table

@Entity
@Table(name = "ACCOUNT")
data class AccountModel(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, name = "FIRST_NAME")
    val firstName: String? = null,

    @Column(nullable = false, name = "LAST_NAME")
    val lastName: String? = null,

    @Column(nullable = false, name = "BIRTH_DATE")
    val birthDate: String? = null,

    @Column(nullable = false, name = "EMAIL")
    val email: String? = null,

    @Column(nullable = false, name = "USERNAME")
    val username: String? = null,

    @Column(nullable = true, name = "LAST_LOGIN")
    val lastLogin: Date? = null,

    @Column(nullable = false, name = "DOCUMENT_NUMBER")
    val documentNumber: String? = null,

    @Column(nullable = false, name = "PHONE_NUMBER")
    val phoneNumber: String? = null,

    @Column(nullable = false, name = "CREATED_AT")
    val createdAt: Date? = null,

    @Column(nullable = false, name = "CREATED_BY")
    val createdBy: String? = null,

    @Column(nullable = true, name = "UPDATED_AT")
    val updatedAt: Date? = null,

    @Column(nullable = true, name = "UPDATED_BY")
    val updatedBy: String? = null

): Serializable