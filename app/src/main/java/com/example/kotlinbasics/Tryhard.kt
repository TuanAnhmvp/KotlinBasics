package com.example.kotlinbasics

import java.lang.Integer.parseInt

fun main(){

//    val answerString = generateAnswerString(12,123)
//    println(answerString)
//
//    val stringLengthFunc: (String) -> Int = { input ->
//        input.length
//    }
//
//    val stringLength: Int = stringLengthFunc("Android")
//    println(stringLength)
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")


        var a: Int = 1
        // simple name in template:
        val s1: String = "a is $a"

        a = 2
        // arbitrary expression in template:
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(s2)



    val tong = maxOf(0,42)
    println("max la : $tong")
    println("max of 0 and 42 is ${maxOf(0, 42)}")

//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items) {
//        println(item)
//    }


        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }

    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("hhhhhhhhh")
    }else{
        println("kkkkk")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
        println(list.indices)
    }


    for (x in 1..5) {
        println(x)
    }

    val fruits = listOf("banana", "akkk", "aocado", "apple","kiwifruit", "aro" )
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    var map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["b"])

    printMessage("hellsssss")

    val dog = Yorkshire()
    dog.sayHello()

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twaina", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2

}

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2



}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun printMessage(message: String){                               // 1
    println(message)
}

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

