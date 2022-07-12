package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Banco

fun main(){

    //com assinatura de parametros no construtor
    //val digioneBank = Banco(nome = "DigiOneBank", numero = 1234567890)
    //sem assinatura de parametros no construtor
    val digioneBank = Banco("DigiOneBank", 1234567890)

    println(digioneBank.nome)
    println(digioneBank.numero)

    val banco2 = digioneBank.copy("Banco Pirata", 1234567890)

    println(banco2.nome)
    println(banco2.numero)

    val banco3 = Banco("Banco do Brasil", 2022002255)
    println(banco3.info())

}