package com.example.kotlin

class Carro(){

    var cor = "Vermelho"

    fun acelerar(){
        //***
    }

}
fun main() {

    var carro: Carro? = null
   // carro = Carro()
    // ***

    //ELVIS operator
    val cor = carro?.cor ?: "cor padrão" // testa se o carro está nulo (no caso está) então não acessa a cor do carro e exibe a cor padrão
    println(cor)


   // if( carro != null){
    //    println(carro.cor)
   // }

 //   println(carro?.cor) //chamada segura (?) para verificar se carro está nulo. Se estiver nulo não executa

}