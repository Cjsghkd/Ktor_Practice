package com.example.h2.dao

import com.example.h2.models.Article

class DAOFacadeImpl: DAOFacade {
    override suspend fun allArticles(): List<Article> {
        TODO("Not yet implemented")
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