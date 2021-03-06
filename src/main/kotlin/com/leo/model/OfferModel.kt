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
@Table(name = "OFFER")
data class OfferModel(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, name = "FK_PRODUCT_ID")
    val productId: Long? = null,

    @Column(nullable = false, name = "PRICE_REAL")
    val priceReal: Long? = null,

    @Column(nullable = false, name = "ISSUE_DATE")
    val issueDate: Date? = null,

    @Column(nullable = false, name = "OFF_PERCENT")
    val offPercent: Double? = null,

    @Column(nullable = false, name = "CREATED_AT")
    val createdAt: Date? = null,

    @Column(nullable = false, name = "CREATED_BY")
    val createdBy: String? = null,

    @Column(nullable = true, name = "UPDATED_AT")
    val updatedAt: Date? = null,

    @Column(nullable = true, name = "UPDATED_BY")
    val updatedBy: String? = null

): Serializable