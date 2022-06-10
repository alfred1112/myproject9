package com.brian

class PersonKotlin {
    fun greeting(){
        println("hello kotlin")
    }
}


//Top-level
fun main() {
    var p = PersonKotlin()
    p.greeting()
}