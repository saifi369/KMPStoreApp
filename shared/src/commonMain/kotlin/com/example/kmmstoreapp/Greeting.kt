package com.example.kmmstoreapp

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class Greeting {
    private val platform: Platform = getPlatform()

    private val httpClient = HttpClient()

//    fun greet(): String {
//        return "Hello from, ${platform.name}!"
//    }

    suspend fun greet(): String {
        val response = httpClient.get("https://ktor.io/docs")
        return response.bodyAsText()
    }
}