package com.bitdev.spotifyclone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform