package com.example.work_qxy.oop

class Coder(company:String, name: String, age: Int) : Person(name,age),Study{
    var company = ""
    init {
        //todo 大坑，主构造函数并不会赋值，需要手动init
        this.company = "小米"
        this.name= name
        this.age = age
    }
    override fun studyKotlin() {
        println(this.name+"正在学习Kotlin")
    }

    override fun studyJava() {
        println(this.name+"正在学习Java")
    }

    override fun toString(): String {
        return super.toString()
    }
}