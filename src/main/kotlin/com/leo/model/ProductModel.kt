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
@Table(name = "PRODUCT")
data class ProductModel(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, name = "FK_PRODUCT_CATEGORY_ID")
    val productCategoryId: Long? = null,

    @Column(nullable = false, name = "FK_MANUFACTURER_ID")
    val manufacturerId: Long? = null,

    @Column(nullable = false, name = "DESCRIPTION")
    val description: String? = null,

    @Column(nullable = false, name = "CODE_REF")
    val codeRef: String? = null,

    @Column(nullable = false, name = "IMAGE_URL")
    val imageUrl: String? = null,

    @Column(nullable = false, name = "WEIGHT")
    val weight: Double? = null,

    @Column(nullable = false, name = "WEIGHT_MEASUREMENT")
    val weightMeasurement: String? = null,

    @Column(nullable = false, name = "DIMENSION_WIDHT")
    val dimendionWidth: Double? = null,

    @Column(nullable = false, name = "DIMENSION_HEIGHT")
    val dimensionHeight: Double? = null,

    @Column(nullable = false, name = "DIMENSION_LENGHT")
    val dimensionLenght: Double? = null,

    @Column(nullable = false, name = "DIMENSION_MEASUREMENT")
    val dimensionMeasurement: String? = null,

    @Column(nullable = false, name = "CREATED_AT")
    val createdAt: Date? = null,

    @Column(nullable = false, name = "CREATED_BY")
    val createdBy: String? = null,

    @Column(nullable = true, name = "UPDATED_AT")
    val updatedAt: Date? = null,

    @Column(nullable = true, name = "UPDATED_BY")
    val updatedBy: String? = null

): Serializable