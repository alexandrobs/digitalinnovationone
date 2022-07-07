package one.digitalinnovation.digitalbank

class Pessoa {

    var nome:String = "Alex"
    var cpf:String = "339.150.308-48"
}

fun main(){
    val alex = Pessoa()

    println(alex.nome)
    println(alex.cpf)
}