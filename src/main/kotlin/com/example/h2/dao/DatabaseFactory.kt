package com.example.h2.dao

import org.jetbrains.exposed.sql.Database

object DatabaseFactory {
    fun init() {
        val driverClassName = "org.h2.Driver"
        val jdbcURL = "jdbc:h2:~/ktor_practice"
        val database = Database.connect(jdbcURL, driverClassName)
    }
}