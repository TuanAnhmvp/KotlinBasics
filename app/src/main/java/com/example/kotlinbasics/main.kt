package com.example.kotlinbasics

fun main(){
    val studentA = Student("nguyen tuan anh", 22)
    val studentB = Student("nguyen tuan anh", 22)
    println(studentA)
    println("StudenA == StudentB:  ${studentA == studentB}")

    val vehicle = HondaStore.WAVE
    val msg = when(vehicle){
        HondaStore.WAVE -> "this is wave"
        HondaStore.CUP -> "this is cup"
        HondaStore.HONDA -> "this is honda"
        HondaStore.WINNER -> "this is winner"
    }


    val vehicleInfo = when(vehicle) {
        HondaStore.WAVE -> "this is wave ${vehicle.price}"
        HondaStore.CUP -> "this is cup ${vehicle.price}"
        HondaStore.HONDA -> "this is honda ${vehicle.price}"
        HondaStore.WINNER -> "this is winner ${vehicle.price}"
    }
    println(msg)
    println(vehicleInfo)

    val add1 = ADD(10, 12)
    val add2 = SUB(10, 12)
    val add3 = MUL(10, 12)
    val add4 = DIV(10, 12)
    println(execute(add1))
    println(execute(add2))
    println(execute(add3))
    println(execute(add4))

    val userA = UserInfo
    userA.userName = "Tuananh"
    userA.age = 11

    val userB = UserInfo
    userB.userName = "Tuananh1"
    userB.age = 12

    println("User A == UserB: ${userA == userB}")
}