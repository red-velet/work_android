package com.example.work_qxy

fun main(){
    //if逻辑结构语句

    //普通if
    println(ifTest(10,20))

    //带返回值的if
    println(ifTest2Return(10,20))

    //语法糖if
    println(ifTest2SyntacticSugar(10,20))

    //语法糖if简洁
    println(ifTest2SyntacticSugar2(10,20))


}
fun ifTest(a:Int,b:Int) : Int{
    var num = 0
    if(a>b){
        num = a
    }else{
        num = b
    }
    return num
}

fun ifTest2Return(a:Int,b:Int) : Int{
    return if(a>b){
         a
    }else{
         b
    }
}

fun ifTest2SyntacticSugar(a:Int,b:Int) : Int =
    if(a>b){
        a
    }else{
        b
    }

fun ifTest2SyntacticSugar2(a:Int,b:Int) : Int = if(a>b) a else b
