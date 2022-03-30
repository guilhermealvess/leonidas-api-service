package com.leo.repository

import com.leo.model.AccountModel
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface AccountRepository: JpaRepository<AccountModel, Long> { }