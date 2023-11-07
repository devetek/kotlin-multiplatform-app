package com.example.kotlinmultiplatformjs

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform