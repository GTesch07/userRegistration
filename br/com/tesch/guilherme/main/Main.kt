
package br.com.tesch.guilherme.main

import br.com.tesch.guilherme.models.Student
import kotlin.collections.mutableListOf

fun main(){

    val students = mutableListOf<Student>()

    println("======== Bem vindo! ========")

    while(true){
        println("Deseja cadastrar um novo usuário? (S/N)")
        val option = readLine()?.trim()?.uppercase()

        if(option == "S"){
            println("\nDigite o nome do usuário: ")
            val name = readLine() ?: "Usuário Desconhecido"
            val student = Student(name)
            students.add(student)
            println("\nUsuário cadastrado com sucesso!\n")
            //println(student.getDetails())
        }else if(option == "N"){
            var viewOption: String?

            do{
                println("\nDeseja visualizar os usuários cadastrados? (S/N)")
                viewOption = readLine()?.trim()?.uppercase()
            
                if(viewOption != "S" && viewOption != "N"){
                    println("\nOpção inválida. Digite S ou N.\n")
                }
            } while(viewOption != "S" && viewOption != "N")

            if (viewOption == "S"){
                println("\n==== Lista de Usuários Cadastrados ====")
                if (students.isEmpty()){
                    println("Nenhum usuário cadastrado.\n")
                }else{
                    for (student in students){
                        println(student.getDetails())
                    }
                }
            }        
            println("Encerrando o programa...")
            break
        }else{
            println("\nOpção inválida. Digite S ou N.\n")
        }
    }
}




