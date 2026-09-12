// data class = cria variaveis que serão usadas no fun main
// O contato terá: nome e telefone
data class Contato(
    val nome: String,
    val telefone: String
)

fun main() {

    // Cria uma lista vazia que vai guardar vários contatos
    val contatos = mutableListOf<Contato>()

    println("=== AGENDA DE CONTATOS ===")
    println("Comandos: ADICIONAR, BUSCAR, REMOVER, LISTA, SAIR")

    // while(true) = fica repetindo para sempre até que o usuário peça para parar
    // O programa só vai parar quando encontrar o "return" no SAIR
    while (true) {

        print("\nDigite um comando: ")

        // readLine() = lê o que o usuário digitou
        // ?. = verifica se existe um valor
        // uppercase() = transforma tudo em letras maiúsculas
        // ?: "" = se não houver valor, usa texto vazio
        val comando = readLine()?.uppercase() ?: ""

        // when = verifica qual comando o usuário digitou
        when (comando) {

            // =========================
            // ADICIONAR UM CONTATO
            // =========================
            "ADICIONAR" -> {

                // Pede o nome
                print("Nome: ")
                val nome = readLine() ?: ""

                // Pede o telefone
                print("Telefone: ")
                val telefone = readLine() ?: ""

                // Cria um novo objeto Contato
                // e adiciona esse contato na lista
                contatos.add(Contato(nome, telefone))

                println("Contato adicionado!")
            }

            // =========================
            // BUSCAR UM CONTATO
            // =========================
            "BUSCAR" -> {

                print("Nome: ")
                val nomeBusca = readLine() ?: ""

                // find = procura na lista
                // it representa cada contato da lista
                // equals = compara os nomes
                // ignoreCase = ignora diferença entre maiúscula e minúscula
                val encontrado = contatos.find {
                    it.nome.equals(nomeBusca, ignoreCase = true)
                }

                // Verifica se encontrou algum contato
                if (encontrado != null) {

                    // Mostra o telefone do contato encontrado
                    println("Telefone: ${encontrado.telefone}")

                } else {

                    // Caso não encontre
                    println("Contato não encontrado")
                }
            }

            // =========================
            // REMOVER UM CONTATO
            // =========================
            "REMOVER" -> {

                print("Nome: ")
                val nomeRemover = readLine() ?: ""

                // removeIf = procura e remove o contato
                // que tiver o nome informado
                val removido = contatos.removeIf {
                    it.nome.equals(nomeRemover, ignoreCase = true)
                }

                // Verifica se algum contato foi removido
                if (removido) {

                    println("Contato removido!")

                } else {

                    println("Contato não encontrado")
                }
            }

            // =========================
            // LISTAR CONTATOS
            // =========================
            "LISTA" -> {

                // isEmpty() = verifica se a lista está vazia
                if (contatos.isEmpty()) {

                    println("Nenhum contato cadastrado.")

                } else {

                    println("=== LISTA DE CONTATOS ===")

                    // forEach = passa por cada contato da lista
                    // it = representa o contato atual
                    contatos.forEach {
                        println("${it.nome} - ${it.telefone}")
                    }
                }
            }

            // =========================
            // SAIR DO PROGRAMA
            // =========================
            "SAIR" -> {

                // size = informa quantos contatos existem
                println(
                    "Agenda encerrada. Total de contatos: ${contatos.size}"
                )

                // return = encerra o programa
                return
            }

            // =========================
            // COMANDO INVÁLIDO
            // =========================
            else -> {

                // Executado quando o usuário digita
                // um comando que não existe
                println(
                    "Comando inválido! Use: ADICIONAR, BUSCAR, REMOVER, LISTA ou SAIR"
                )
            }
        }
    }
}