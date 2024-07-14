package com.example.work_qxy

/**
 * kotlin循环语句
 */
fun main(){
    //区间 - 前闭后闭
    var range = 0..10
    //for in循环
    println("\nfor in循环 + ...")
    for(i in range){
        print(i)
        print(" ")
    }

    //区间 - 左闭右开
    println("\nfor in循环 + until")
    var rangeUntil = 0 until  10
    //for in循环
    for(i in rangeUntil){
        print(i)
        print(" ")
    }

    //step关键字 - 自主控制循环
    println("\nfor in循环 + until + step")
    for(i in rangeUntil step 2){
        print(i)
        print(" ")
    }

    //区间 - 左闭右闭 - 降序
    println("\nfor in循环 + downTo + step")
    var downTo = 10 downTo   0
    //for in循环
    for(i in downTo step 2){
        print(i)
        print(" ")
    }
}