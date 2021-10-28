fun main(args: Array<String>) {

    For

    1 - Faça um programa que leia um valor e imprima sua tabuada (aceite apenas números entre 1 e 10). Imprima, logo em seguida, a tabuada ao contrário


    print("Digite um número: ")
    var tabuada = readLine()!!.toInt()

    for(i in 1..10){

        println("O resultado é $i X $tabuada = ${i * tabuada}")

    }
    for(i in 10 downTo 1) {

        println("O resultado é $i X $tabuada = ${i * tabuada}")
    }

    2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.

    var contImp = 0
    var contPar = 0
    for(i in 1..10 step 2){
        contImp++
    }
    println("A quantidade de números impares entre 1 a 10 é: $contImp")

    for(i in 0..10 step 2){
        contPar++
    }
    println("\nA quantidade de números pares entre 0 a 10 é: $contPar")
}

    3 - Crie um programa para ler 4 notas e mostrar a média delas.

    var nota = 1.0
    var soma = 0.0
    var cont = -1.0
    println("Digite as suas notas abaixo para calcular a média e termine colocando o 0: ")

    while (nota != 0.0) {
    nota = readLine()!!.toDouble()
    soma += nota
    cont++
}
    println("A média de todas as notas é: ${soma/cont}")
}

    4 - Crie um programa que leia 10 valores e identifique a quantidade de números pares e ímpares*/

    var cont = 1
    var contPar = 0
    var contImpar = 0

    while(cont<=10){
     println("Digite um número: ")
    var numero = readLine()!!.toInt()
    if(numero%2==0){
        contPar++
    }else {
        contImpar++
    }
    cont++
}
println("A quantidade de números digitados pares foram $contPar")
println("A quantidade de números digitados impares foram $conntImpar")

    5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre:

    - A soma dos números digitados.
    - A média deles
    - O menor número digitado
    - O maior número digitado

    var num = 0
    var soma = 0
    var cont = 0
    var media = 0.0
    var menor = 0
    var maior = 0

    do{

        print("Digite um número diferente de 0: ")
        num = readLine()!!.toInt()

    if(cont == 0)

        if(num != 0){

        soma += num

        if(cont == 0){
        maior = num
        menor = num
        }else{
        if(num > maior){
            maior = num
        }

        if(num < menor){
            menor = num
        }
    }

    cont++
    }

    while(num != 0)

    media = soma/cont.toDouble()

    println("A soma de todos os números é $soma")
    println("A média dos números é $media")
    println("O menor número é $menor")
    println("O maior número é $maior")





