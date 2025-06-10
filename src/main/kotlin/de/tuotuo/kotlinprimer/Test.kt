package de.tuotuo.de.tuotuo.kotlinprimer

import JavaMain
import kotlin.reflect.KClass

var age = 18
var name = "Zhang San"

var name2: String? = null

fun main() {
    // !! 表示强制转换
//    name = name2!!
//    name2 = name
    println(name)
    testClass(JavaMain::class.java)
    testClass(KotlinMain::class)
    println(JavaMain.`in`)
}

fun printLen(str: String): String {
    println("这个字符串是: $str")

    return str
}

fun testClass(clazz: Class<JavaMain>) {
    println(clazz.simpleName)
}

fun testClass(clazz: KClass<KotlinMain>) {
    println(clazz.simpleName)
}