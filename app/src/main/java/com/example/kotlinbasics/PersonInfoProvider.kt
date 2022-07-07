package com.example.kotlinbasics

import kotlin.system.exitProcess

interface PersonInfoProvider{
    fun printInfo(person : Person)
}

class BasicInfoProvider : PersonInfoProvider{
    override fun printInfo(person: Person) {
        println("printInfo")
    }
}

fun main(){
    val priovider = BasicInfoProvider()

}