package com.example.plugins

import com.example.http.routes.customer.customerRouting
import com.example.http.routes.order.getOrderRoute
import com.example.http.routes.order.listOrdersRoute
import com.example.http.routes.order.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
