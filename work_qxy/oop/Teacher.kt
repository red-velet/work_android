package com.example.work_qxy.oop

/**
 * 必须调用主构造函数，没有就去找
 */
class Teacher : Person {
    constructor(name: String, age: Int): super(name, age) {
    }
}