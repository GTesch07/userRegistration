
package br.com.tesch.guilherme.main

import br.com.tesch.guilherme.models.Student

fun main(){

    println("======== Bem vindo! ========")
    println("Vamos realizar seu cadastro")
    println("Digite seu nome: ")
    val name = readLine() ?: "Usuário Desconhecido"

    val student = Student(name)
    println(student.getDetails())

}




