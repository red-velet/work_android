package com.example.work_qxy

fun main(){
    //when逻辑结构语句

    //when语句
    println(whenTestMethod1("jack"))

    //不带参数
    println(whenTestMethod2("jack"))

    //when判断使用函数
    println(whenTest2Function("mark"))

    //Number类型判断
    println(checkType(1))
    println(checkType(2L))
    println(checkType(3F))

}
fun whenTestMethod1(name:String) : Int = when(name){
        "jack"  -> 60
        "shawn"  -> 90
        else -> 0
}

fun whenTestMethod2(name:String) : Int = when{
    name == "jack"  -> 60
    name =="shawn"  -> 90
    else -> 0
}

fun whenTest2Function(name:String) : Int = when{
    name.startsWith("l") -> 0
    name == "mark"  -> 60
    name == "red"  -> 90
    else -> 0
}

//Number没有Boolean、Char、String等类型
fun checkType(number: Number) = when(number){
    is Int -> println("Number Is Int")
    is Float -> println("Number Is Float")
    else -> println("Not Support Type")
}
