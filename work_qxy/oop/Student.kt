package com.example.work_qxy.oop

/**
 * 继承使用 冒号:
 */
class Student(stuId:Int,score:Double,name: String, age: Int) : Person(name,age){
    var studentId = 0
    var score = 0.0

    init {
        this.studentId = stuId
        this.score = score
        this.name = name
        this.age = age
    }


    init {
        println("init...")
    }

    fun study(){
        println("那个正在吃饭的人，ta的名字是"+this.name+"他今年年龄是"+this.age+"岁,ta的学号是"+this.studentId+"它考试获得了"+this.score+"分")
    }

}