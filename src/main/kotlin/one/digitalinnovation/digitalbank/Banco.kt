package one.digitalinnovation.digitalbank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "Nome do banco: $nome, numero da conta: $numero"
}
