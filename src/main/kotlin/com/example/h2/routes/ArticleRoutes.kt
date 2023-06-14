package com.example.h2.routes

import com.example.h2.dao.dao
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.util.*

fun Route.articleRouting() {
    route("/articles") {
        get {
            call.respond(mapOf("articles" to dao.allArticles()))
        }

        post {
            val formParmeters = call.receiveParameters()
            val title = formParmeters.getOrFail("title")
            val body = formParmeters.getOrFail("body")
            val article = dao.addNewArticle(title, body)
            call.respondRedirect("/articles/${article?.id}")
        }

        get("{id}") {
            val id = call.parameters.getOrFail<Int>("id").toInt()
            call.respond(mapOf("article" to dao.articles(id)))
        }

        get("{id}/edit") {
            val id = call.parameters.getOrFail<Int>("id").toInt()
            call.respond(mapOf("article" to dao.articles(id)))
        }

        post("{id}") {
            val id = call.parameters.getOrFail<Int>("id").toInt()
            val formParmeters = call.receiveParameters()
            when (formParmeters.getOrFail("_action")) {
                "update" -> {
                    val title = formParmeters.getOrFail("title")
                    val body = formParmeters.getOrFail("body")
                    dao.editArticle(id, title, body)
                    call.respondRedirect("/articles/$id")
                }
                "delete" -> {
                    dao.deleteArticle(id)
                    call.respondRedirect("/articles")
                }
            }
        }
    }
}