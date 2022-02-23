fun main() {

    //Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
    //10-14 infantil
    //15-17 juvenil
    //18-25 adulto



    println("Digite sua idade: ")
    val idade = readLine()!!. toInt()

       when(idade){

           in 10..14 -> println ("Você esta na categoria infantil!")
           in 15..17 -> println("Você esta na categoria juvenil!")
           in 18..25 -> println("Você esta na categoria adulto!")
           else -> println("Idade inválida")
       }


}