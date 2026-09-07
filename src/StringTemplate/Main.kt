package StringTemplate

fun main() {

    //variáveis
    val produto = "Banner"
    val quantidade = 3
    val preco = 45.00

    val total = quantidade * preco

    println("produto: $produto")
    println("Quantidade: $quantidade")
    println("Preço: R$ $preco")

    println("Total R$: ${quantidade * preco}")

    println("Total Calculado R$: $total")


}