package com.example.work_qxy.oop

fun main(){
//    var p = Person()
//    p.name = "qxy"
//    p.age = 18
//    p.eat()

    //主构造函数和继承问题
    var student = Student(2024,99.0,"jack",18)
    //student.name = "jack"
    student.study()

    var coder = Coder("小米","shawn",19)
    studyCS(coder)


    var coder2 = Coder2("shawn",19,"小米")
    studyCS2(coder2)

}
fun studyCS(coder:Coder){
    coder.studyKotlin()
    coder.studyJava()
}

fun studyCS2(coder:Coder2){
    coder.studyKotlin()
    coder.studyJava()
}