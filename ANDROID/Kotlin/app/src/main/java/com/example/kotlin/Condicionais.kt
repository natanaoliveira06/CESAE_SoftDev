package com.example.kotlin

fun main() {

/*
    val notaAluno = 7
    val condicao = notaAluno >= 6

    if (condicao){
        println("Aluno Aprovado")
    }else{
        println("Aluno Reprovado")
    } */


    // ---------------------------


  /*  val opcao = 1

    if ( opcao == 1 ){
        println("Cartão de Crédito")
    }else if ( opcao == 2 ){
        println("Extrato Bancário")
    }else if ( opcao == 3 ){
        println("Saldo")
    }else {
        println("Nenhuma opção selecionada")
    } */


    // ---------------------------


 /*   val opcao = 10

    if ( opcao in 1..3 ){ // intervalo
        println("Opções elecionadas: 1, 2, 3")
    }else if (opcao in 4..8){
        println("Opções elecionadas: 4, 5, 6, 7, 8")
    }  */


    // ---------------------------


    val opcao = 1

    when( opcao ){ // similar switch em java
        1 -> println("Cartão de Crédito")
        2 -> println("Extrato Bancário")
        in 3 .. 5 -> println("Saldo") // entre 3 e 5
        else -> println("Nenhuma opção selecionada")

    }



}