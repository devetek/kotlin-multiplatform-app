package com.example.kotlinmultiplatformjs

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        var randomBoolean: Boolean = Random.nextBoolean()
        var firstWordWithCondition: String = if (randomBoolean) "Hello" else "Hi"

//        println("Im Here!! ${platform.toString()}")

        return "${firstWordWithCondition}, ${platform.name}!"
    }
}