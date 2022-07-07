package com.example.kotlinbasics

object UserInfo {
    var userName : String = ""
    var age : Int = 0

    fun sayHello(){
        println("I am ${userName} ${age}")
    }
}