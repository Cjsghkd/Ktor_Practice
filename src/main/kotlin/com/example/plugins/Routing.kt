package com.example.plugins

import com.example.http.routes.customer.customerRouting
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        customerRouting()
    }
}
