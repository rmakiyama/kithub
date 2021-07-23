package com.rmakiyama.kithub

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}