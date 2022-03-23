package com.leo.model

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import java.io.Serializable

@Entity
data class OfferDto(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false)
    val fkProductId: Long? = null,

    @Column(nullable = false)
    val priceReal: Long? = null,

    @Column(nullable = false)
    val issueDate: Date? = null,

    @Column(nullable = false)
    val offPercent: Double? = null,

    @Column(nullable = false)
    val createdAt: Date? = null,

    @Column(nullable = false)
    val createdBy: String? = null,

    @Column(nullable = true)
    val updatedAt: Date? = null,

    @Column(nullable = true)
    val updatedBy: String? = null

): Serializable