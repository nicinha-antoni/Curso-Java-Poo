package LoopsArrays;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class loopsEx4ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Digite a quantidade de numeros para analisar impares e pares: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;

        }
        while (count < quantNumeros);

        System.out.println(" Quatidade numeros pares é: " + quantPares);
        System.out.println(" Quantidade de numeros Impares é: " + quantImpares);
        System.out.println(" Acabou xuxu ^^) ");
    }

}
