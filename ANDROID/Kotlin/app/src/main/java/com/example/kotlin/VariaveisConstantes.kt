package com.example.kotlin

fun retornaNomeUsuario(){
    //Executa e retorna algo
}

const val pais = "Brasil" // global - Disponível dentro do arquivo inteiro e não só dentro da função

class Usuario{

}

fun main() {

  //  const val pais = "Brasil"  // ERRO

    var nome = "Natana" // variável mutável  -> Em tempo de execução
    nome = "Marcelo"

    var nomeUsuario = retornaNomeUsuario()

    val nome2 = "Paula" // imutável - constante
    // normalmente usa-se mais o val. Usa-se o var só quando o valor for mutável.

    val idade: Int = 30

    val numero1 = 30
    val numero2 = 20
    val resultado = numero1 + numero2

    val usuario = Usuario() // instanciar

    println(nome)
    println(resultado)
    println(pais)


}
