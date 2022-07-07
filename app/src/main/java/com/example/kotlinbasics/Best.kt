package com.example.kotlinbasics

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
    fun aa(){
        println("aaaaaa")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1

fun main() {
    val lion = Asiatic("Rufo")                              // 2
    val lion2 : Lion = Asiatic("Rufo")


    lion.sayHello()
    lion2.sayHello()
    lion2.aa()
    lion.aa()

    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
    println(checkWhen("hello"))

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

    val state = State.three
    val message = when (state){
        State.one -> "1"
        State.two -> "2"
        State.three -> "3"
    }
    println(message)

    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            d -> println("Some useful info on user $d")
    }
    // getSysSudoers().add(5) <- Error!

}

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}


                        // 8


fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}

fun checkWhen(obj: Any): Any{
    val resultWhen = when(obj){
        1 -> "one"
        2 -> "two"
        "hello" -> 1
        else -> 32
    }
    return resultWhen
}

class MyClass

enum class State{
    one,
    two,
    three
}