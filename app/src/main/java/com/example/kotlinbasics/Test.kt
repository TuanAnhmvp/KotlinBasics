package com.example.kotlinbasics

fun main(){
//    var a : Int = 3
//    a.toLong();
//
//    println("a = $a")


//    var ten : String? = "tuananh"
//    ten = null
//
//    var g : Int = 5
//    for (i in 0 until g step 2){
//        println("vi tri $i")
//    }
//
//    var mangso : IntArray = intArrayOf(5,6,7,7,4,3)
//    var aa = mangso.get(2)
//    println("a = $aa")
//    var mangten : List<String> = listOf("TuanAnh", "HuyAnh", "aa")
//    var result = mangten.get(1)
//    println("resutl = $result")

//    var mangten : ArrayList<String> = ArrayList()
//    mangten.add("TuanAnh")
//    mangten.add("HuyAnh")
//    mangten.add("Qanh")
//    var size = mangten.size
//    println(mangten)
//    println("size = $size")
//    mangten.removeAt(1)
//    println(mangten)
//    mangten.set(0, "TuanAnh sua")
//    println(mangten)
//    var name : String? = "aa"
//
//    println(name)
//
//    name = null
//    println(name)

var aa = arrayOf("tuananh" , "tuânnan2", 3)
//    println(aa.get(0))
//    println(aa[1])
//    println(aa.get(2))
//    for (aa in aa){
//        println(aa)
//    }

//    aa.forEach {
//        println(it)
//    }

//    aa.forEach { aa ->
//
//    }
    val cc = listOf("android", "kotlin", "ios")
    val dd = listOf("android1", "kotlin1", "ios1")
    sayHello(dd, cc)


}
fun sayHello(aa : List<String>, bb : List<String>){
    bb.forEach { bb->
        println("$aa $bb")

    }
}

