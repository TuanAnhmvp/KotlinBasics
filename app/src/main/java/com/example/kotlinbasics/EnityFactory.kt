package com.example.kotlinbasics

interface IdProvider{
    fun getId() : String
}

class Entity private constructor(val id : String) {
    companion object Factoru : IdProvider {

        override fun getId(): String {
            return "123"
        }

        const val id = "id"
        fun create() = Entity(id)
    }
}

fun main(){
    val entity = Entity.Factoru.create()
    Entity.id
}

