package com.example.h2.dao

import com.example.h2.models.Article

interface DAOFacade {
    suspend fun allArticles(): List<Article>
    suspend fun articles(id: Int): Article?
    suspend fun addNewArticle(title: String, body: String): Article?
    suspend fun editArticle(id: Int, title: String, body: String): Boolean
    suspend fun deleteArticle(id: Int): Boolean
}