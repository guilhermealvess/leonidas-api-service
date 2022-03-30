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
@Table(name = "PACKAGE")
data class PackageDto(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, name = "FK_ACCOUNT_ID")
    val accountId: Long? = null,

    @Column(nullable = false, name = "FK_ADDRESS_ID")
    val addressId: String? = null,

    @Column(nullable = false, name = "FK_TYPE_PAYMENT_ID")
    val typePaymentId: String? = null,

    @Column(nullable = false, name = "FK_STATUS_PACKAGE_ID")
    val statusPackageId: String? = null,

    @Column(nullable = false, name = "DEST_NAME")
    val destName: String? = null,

    @Column(nullable = false, name = "ISSUE_DATE")
    val issueDate: Date? = null,

    @Column(nullable = false, name = "IS_OPEN")
    val isOpen: Boolean? = null,

    @Column(nullable = true, name = "NFE")
    val nfe: String? = null,

    @Column(nullable = true, name = "NFE_URL_STORAGE")
    val nfeUrlStorage: String? = null,

    @Column(nullable = false, name = "CREATED_AT")
    val createdAt: Date? = null,

    @Column(nullable = false, name = "CREATED_BY")
    val createdBy: String? = null,

    @Column(nullable = true, name = "UPDATED_AT")
    val updatedAt: Date? = null,

    @Column(nullable = true, name = "UPDATED_BY")
    val updatedBy: String? = null

): Serializable