package com.example.work_qxy

fun main() {
    println("hello kotlin")

    //类型推导机制
    //val - value 不可变
    val num = 10
    println("num = " + num)
//不可变    println("num = " + num++)

    //var可变
    var num2 = 10
    num2++;
    println("num2 = " + num2)

    //todo 不能这样吗？ 思考
//    num2 = "hello"
//    println("num2 = " + num2)

    //声明类型
    var num3: Int = 20
    println("num3 = " + num3)
    //声明就不能改类型了 num3 = "hello"
}