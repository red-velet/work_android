package com.example.work_qxy.oop

/**
 * 类默认被限制了私有，不能被继承，继承需要添加open
 */
open class Person(name : String,age : Int) {
    var name = ""
    var age = 0

    fun eat(){
        println("那个正在吃饭的人，ta的名字是"+name+"他今年年龄是"+age+"岁")
    }

}