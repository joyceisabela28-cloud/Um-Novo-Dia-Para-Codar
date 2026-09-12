fun main(){

val estudantes = mutableListOf<String>()
var nome = ""

while (nome.uppercase() != "PARE") { //!= usamos para ver se algo é diferente de outro

    println("Digite o nome do estudante:")
    nome = readln()


    if (nome.uppercase() != "PARE") {

        estudantes.add(nome)

    }
}
    println("Quantidade de estudantes: ${estudantes.size}")
    println("Estudantes cadastrados: $estudantes")


}