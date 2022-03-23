package com.leo.model

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import java.io.Serializable

@Entity
data class ProductDto(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false)
    val fkProductCategoryId: Long? = null,

    @Column(nullable = false)
    val fkManufacturerId: Long? = null,

    @Column(nullable = false)
    val description: String? = null,

    @Column(nullable = false)
    val codeRef: String? = null,

    @Column(nullable = false)
    val imageUrl: String? = null,

    @Column(nullable = false)
    val weight: Double? = null,

    @Column(nullable = false)
    val weightMeasurement: String? = null,

    @Column(nullable = false)
    val dimendionWidth: Double? = null,

    @Column(nullable = false)
    val dimendionHeight: Double? = null,

    @Column(nullable = false)
    val dimendionLenght: Double? = null,

    @Column(nullable = false)
    val dimendionMeasurement: String? = null,

    @Column(nullable = false)
    val createdAt: Date? = null,

    @Column(nullable = false)
    val createdBy: String? = null,

    @Column(nullable = true)
    val updatedAt: Date? = null,

    @Column(nullable = true)
    val updatedBy: String? = null

): Serializable