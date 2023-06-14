package com.example.h2.dao

import com.example.h2.dao.DatabaseFactory.dbQuery
import com.example.h2.models.Article
import com.example.h2.models.Articles
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll

class DAOFacadeImpl: DAOFacade {
    private fun resultRowToArticle(row: ResultRow) = Article(
        id = row[Articles.id],
        title = row[Articles.title],
        body = row[Articles.body]
    )

    override suspend fun allArticles(): List<Article> = dbQuery {
        Articles.selectAll().map(::resultRowToArticle)
    }

    override suspend fun articles(id: Int): Article? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewArticle(title: String, body: String): Article? {
        TODO("Not yet implemented")
    }

    override suspend fun editArticle(id: Int, title: String, body: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteArticle(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}