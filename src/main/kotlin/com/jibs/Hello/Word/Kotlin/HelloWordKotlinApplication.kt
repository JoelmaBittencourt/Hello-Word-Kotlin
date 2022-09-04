package com.jibs.Hello.Word.Kotlin

import CarManufacturer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWordKotlinApplication

fun main(args: Array<String>) {
	println("Hello word")
	val student= Student("Alex")
	println("Studant name:${student.name}")
	val car= CarManufacturer("Mercedes")
	println("Car name:${car.name}")
}
