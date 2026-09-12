// Exiba uma lista de planetas do sistema solar ("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno" e "Plutão") para o usuário. Em seguida, peça ao usuário para digitar o nome de um planeta. Verifique se o planeta que o usuário informou está na lista e informe ao usuário.

// "Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno" e "Plutão"

fun main() {
// EPS
// Entrada
    var lista_planetas =
        mutableListOf<String>("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")

    var lista_planetas2 =
        mutableListOf<String>("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")

    println(lista_planetas)
    var resposta: String
    var continuar = true

    // Processamento
    while(continuar) {
        println("Informe o nome do planeta para checarmos na lista: ")
        var inputUsuario = readln()

        if (inputUsuario in lista_planetas) {
            println("Planeta encontrado.")     // Saída 1
            println("Você gostaria de removê-lo? S/N")

            resposta = readln()
            if (resposta.uppercase() == "S") {
                lista_planetas.remove(inputUsuario)
                println("O planeta $inputUsuario foi removido. Essa é a lista atual: $lista_planetas")
            }
        } else {
            println("Planeta não encontrado.") // Saída 2
            println("Você gostaria de adicioná-lo? S/N")

            resposta = readln()
            if (resposta == "S" || resposta == "s") {
                lista_planetas.add(inputUsuario)
            }
        }

        println("Você gostaria de continuar? S/N")
        resposta = readln()
        if (resposta.uppercase() == "N") {
            continuar = false
        }
    }

    println("Programa encerrado com sucesso.")
}