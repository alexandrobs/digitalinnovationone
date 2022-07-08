package one.digitalinnovation.digitalbank

class Pessoa {

    var nome:String = "Alex"

    //exemplo para deixar set private
    var cpf:String = "339.150.308-48"
    private set
    //

    //exemplo modificador de acesso private, sem get e sem set
    //private var cpf:String = "339.150.308-48"

    //

    //exemplo de inner class
//    inner class Endereco{
//        var rua:String = "rua vila lobos"
//    }

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val alex = Pessoa()

    println(alex.nome)

    //quando o set ta privado, isso da erro, porque apenas o get ta publico
    //alex.cpf = "123456"

    println(alex.cpf)

    //exemplo chamando membro inner class
    //println(alex.Endereco().rua)

    println(alex.pessoaInfo())
}