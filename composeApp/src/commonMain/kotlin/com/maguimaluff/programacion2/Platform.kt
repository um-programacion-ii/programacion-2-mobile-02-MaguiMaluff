package com.maguimaluff.programacion2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform