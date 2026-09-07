package VariaveisValVar

fun main() {

    //variável "val" recebe um número que não pode receber outro valor
    val codigo = 1001

    //variável "var" permite alterar o conteúdo
    var produto = "Cartão de Visita"

    //Kotlin identifica automaticamente que o preço é Double
    var preco = 51.0

    //Mostra os Valores
    println(codigo)
    println(produto)
    println(preco)

    //alterando variável
    preco = 55.00
    println("Novo Preço é: R$ $preco")



}
