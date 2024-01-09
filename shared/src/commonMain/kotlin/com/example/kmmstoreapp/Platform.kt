package com.example.kmmstoreapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform