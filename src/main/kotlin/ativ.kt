fun main(){

    //Faça um programa que o usuário digite um número e o programa retorne o mês referente ao valor.

    print("Digite um numero: ")
    var mes = readLine()!!.toInt()

    when(mes){

        1-> println("JANEIRO")
        2-> println("FEVEREIRO")
        3-> println("MARÇO")
        4-> println("ABRIL")
        5-> println("MAIO")
        6-> println("JUNHO")
        7-> println("JULHO")
        8-> println("AGOSTO")
        9-> println("SETEMBRO")
        10-> println("OUTUBRO")
        11-> println("NOVEMBRO")
        12-> println("DEZEMBRO")
        else-> println("NÚMERO INVÁLIDO")
    }







}