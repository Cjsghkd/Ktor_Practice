package com.example.http.routes.order

import com.example.http.models.order.orderStorage
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.listOrdersRoute() {
    get("/order") {
        if (orderStorage.isNotEmpty()) call.respond(orderStorage)
    }
}