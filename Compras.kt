fun main(){

    val frutas = mutableListOf(
        "Laranja",
        "Banana",
        "Maçã",
        "Uva",
        "Pêra"
    )

    println(frutas)

    var fruta: String

    println("Digite o nome da fruta que deseja remover:")
    fruta = readln()

    while(fruta.uppercase() != "PARE" && frutas.isNotEmpty()){

        if (fruta in frutas) {
            frutas.remove(fruta)
            println("Fruta foi retirada da lista")

        } else {
            println("Fruta indisponível no nosso mercado")
        }

        println("Digite o nome da fruta que deseja remover: ")
          fruta = readln()

    }


    if (frutas.isEmpty()){
        println("Lista de compras finalizada")
    }else{
 println("Frutas restantes: $frutas")
}

}



