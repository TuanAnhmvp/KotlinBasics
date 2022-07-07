package com.example.kotlinbasics




fun main(){

//    //TODO: add
//
//    var myName = "TuanAnh"
//    myName = "haha"
//
//    val aa = 6565656565
//
//
//    val myStr = "TuanAnh"
//    val firsCharInString = myStr[3]
//    val lasCharIntString = myStr[myStr.length-1]
//
//    println(""+firsCharInString)
//    println(""+lasCharIntString)
//    println("Hello $myName an the length of myStr is ${myStr.length}")'

//    val isEqual = false
//
//    println("faff ${5>4}")

//    var myNum = 3
//
//    myNum ++
//
//    println("my Num = $myNum")
//    println("my Num = ${myNum++}")
//    println("my Num = $myNum")
//    println("my Num = ${++myNum}")
//    println("my Num = $myNum")

//    var h1 = 180
//    var h2 = 200
//
//    if (h1>h2){
//        println("haha")
//    }else{
//        println("hoho")
//    }

//    var season = 3
//    when(season){
//        1 -> println("spring")
//        2 -> println("Sumer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        else -> println("Invalid Season")
//    }

//     var month = 6
//    when(month){
//        in 1..9 -> println("dung")
//        in 5..10 -> println("sai")
//        6,12,3 -> println("dung")
//    }

//    var x : Any = 15.94

//    var x = 1
//    while(x <=10){
//        println("$x")
//        x++
//    }
//    println("done")

//    for(num in 1..10 step 2){
//        println("$num")
//
//    }
//
//    for (i in 1 until 10 step 3){
//        print("$i ")
//    }

//    var result = addUp(5, 6)
//    println("result = $result")
//
//    var result2 = avg(5.65, 8.4)
//    println("avg = $result2")

//    val on = 1_00_999
//
//    val person : Person = Person("tuananh", "nguyen")
//
//    printName1("tuananh")
//    println(printAge(10))
    val student = Student1("tuananh", 20)
    student.name = "aaaa"
    println("${student.name} ${student.age}")
    val studenA : Student1? = null
    println(studenA?.name)

    val studentB = Student1("tuananh", 20)
    studentB.sayHello()
    studentB.goHome()
    println(studentB.printName("dddd"))


}

open class People{
    fun sayHello(){
        println("Hello")
    }
}

interface MyInterface {
    fun goHome()
}

class Student1(var name: String, var age: Int) : People(), MyInterface{
    fun printName(name: String) : String {
        return name +" Jav"

}

    override fun goHome() {
        println("toi di ve nha")
    }

}

fun printName1(name: String){
    println(name)
}

fun printAge(age: Int) :Int{
    return age+10
}

//fun addUp(a: Int, b: Int) : Int{
//    return a+b
//}
//
//fun avg(a: Double, b: Double):Double{
//    return (a+b)/2
//}

