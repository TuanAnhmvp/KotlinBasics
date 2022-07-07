package com.example.kotlinbasics

sealed class Operation (val a : Int, val b : Int)
class ADD(val numberOne : Int, val numberTwo : Int) : Operation(numberOne, numberTwo)
class SUB(val numberOne : Int, val numberTwo : Int) : Operation(numberOne, numberTwo)
class MUL(val numberOne : Int, val numberTwo : Int) : Operation(numberOne, numberTwo)
class DIV(val numberOne : Int, val numberTwo : Int) : Operation(numberOne, numberTwo)

fun execute(op : Operation) = when(op){
    is ADD -> op.numberOne + op.numberTwo
    is SUB -> op.numberOne - op.numberTwo
    is MUL -> op.numberOne * op.numberTwo
    is DIV -> op.numberOne / op.numberTwo
}