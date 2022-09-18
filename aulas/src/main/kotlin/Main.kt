import java.util.*

fun main(args: Array<String>) {
    // === CONCATENAÇÃO ===
    var nome = "Maria"
    var idade1 = 25
    var profissao = "Programadora Web"
    println("Meu nome é $nome, tenho $idade1 anos e sou $profissao")

//==============================================
    // OPERADORES ARITIMÉTICOS
// SOMA + SUBTRAÇÃO - MULTIPLICAÇÃO * DIVISÃO / RESTO DA DIVISÃO %
    var numero1 = 10
    var numero2 = 20
    println(numero1 + numero2)
// OPERADORES DE ENCREMENTO E DECREMENTO
    println(++numero2)
    println(--numero1)

// ==============================================
    // OPERADORES RELACIONAIS
// IGUAL == | DIFERENTE != | MENOR < | MAIOR > | MENOR IGUAL <= | MAIOR IGUAL >=
    var valor1 = 10
    var valor2 = 20
    println(valor1 == valor2)

// ==============================================
    // ESTRUTURA CONDICIONAL IF/ELSE
    var idade = 19

    if (idade <= 10) {
        println("Criança")
    } else if (idade <= 17) {
        println("Adolescente")
    } else {
        println("Adulto")
    }


    // ==============================================
    // OPERADORES LOGICOS: && AND / || OR
    println("== OPERADORES LOGICOS: && AND / || OR ==")

    //===== AND =====
    if (20 == 20 && 10 < 20) {
        println("Verdadeiro")
    } else {
        println("Falso")
    }
    //==== OR ===
    if (20 != 20 || 10 < 20) {
        println("Verdadeiro")
    } else {
        println("Falso")
    }

    // ==============================================
    // ARRAYS
    println("== ARRAYS ==")

    var listaCompras = arrayOf(
        "Frango",
        "Arroz", //0
        "Feijão",//1
        "Açucar",//2
        "Batata",//3
        "Carne",//4
        "Ovos",
        "macarrão",
        "Abacate"

    )
    println(listaCompras.size)
    println(Arrays.toString(listaCompras))
    println(listaCompras[2])


    // ==============================================
    // ESTRTURA DE REPETIÇÃO WHILE (ENQUANTO)
    println("== Estrutura de Repetição com WHILE ==")

    var indice = 0

    while (indice <= listaCompras.size-1){
        println(listaCompras[indice])
        indice++
    }

    // ==============================================
    // ESTRTURA DE REPETIÇÃO FOR
    println("== Estrutura de Repetição com FOR ==")

    for (indice in 2..5){
        println(listaCompras[indice])

    }
// ==============================================
    //  ESTRUTURA DO WHEN
    println("== ESTRUTURA DO WHEN ==")

    var opcao = 1
   var mensagem = when(opcao){
        1 -> "Suco de laranja"
        2 -> "Suco de Uva"
        3-> "Suco de Morango"
       else -> "Nenhuma opção foi selecionada"
    }
    println(mensagem)


}