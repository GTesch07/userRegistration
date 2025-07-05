package br.com.tesch.guilherme.models
import kotlin.random.Random

open class Person(private val name: String) {
    open fun showDetails() {
        println("Name: $name")
    }

    fun getName() = name
}

class Student(name: String) : Person(name) {
    private val id: String = generateRandomId()

    override fun showDetails() {
        println("Name: ${getName()} \nID: $id")
    }

    fun getDetails(): String {
        return "Name: ${getName()} \nID: $id"
    }

    private fun generateRandomId(): String {
        val length = 6
        val allowedChars = "0123456789"
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}