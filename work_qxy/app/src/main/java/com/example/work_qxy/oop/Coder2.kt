package com.example.work_qxy.oop

class Coder2 (name: String, age: Int, company: String) : Person(name,age),Study {
    //方式1赋值
    var company:String = company


    //方式2赋值
    init {
        this.name = name
    }


    //方式3赋值 - 不行
//    var age:Int = age

    //todo 方式4赋值
//    var company = ""
//    constructor() : this("",2){
//
//    }
//    constructor(name:String,age: Int) : this(name,age,company){
//
//    }


    override fun studyKotlin() {
        println(this.name+"正在学习Kotlin"+this.company)
    }

    override fun studyJava() {
        println(this.name+"正在学习Java"+this.company)
    }
}