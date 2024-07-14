package com.example.work_qxy

import kotlin.math.max
import kotlin.math.min

fun main(){
    //kotlin的方法/函数
    // 有返回值
    println(getLargerNumber(10,20))

    // 无返回值
    println(printHelloWorld())

    //语法糖
    println(getMinerNumber(10,20))

}

fun getLargerNumber(param1:Int,param2:Int) :Int{
    return max(param1,param2)
}

fun printHelloWorld() {
    println("hello world")
}

fun getMinerNumber(param1:Int,param2:Int) :Int = min(param1,param2)