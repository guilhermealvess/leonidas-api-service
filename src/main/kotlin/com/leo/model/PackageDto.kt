package com.leo.model

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import java.io.Serializable

@Entity
data class PackageDto(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false)
    val fkAccountId: Long? = null,

    @Column(nullable = false)
    val fkAddressId: String? = null,

    @Column(nullable = false)
    val fkTypePaymentId: String? = null,

    @Column(nullable = false)
    val fkStatusPackageId: String? = null,

    @Column(nullable = false)
    val destName: String? = null,

    @Column(nullable = false)
    val issueDate: Date? = null,

    @Column(nullable = false)
    val isOpen: Boolean? = null,

    @Column(nullable = true)
    val nfe: String? = null,

    @Column(nullable = true)
    val nfeUrlStorage: String? = null,

    @Column(nullable = false)
    val createdAt: Date? = null,

    @Column(nullable = false)
    val createdBy: String? = null,

    @Column(nullable = true)
    val updatedAt: Date? = null,

    @Column(nullable = true)
    val updatedBy: String? = null

): Serializable