package com.example.trumimobile

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}