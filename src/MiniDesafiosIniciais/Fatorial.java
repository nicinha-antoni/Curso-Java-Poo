package MiniDesafiosIniciais;
/*
Utilizando a estrutura de repetição enquanto (while) escreva um programa que recebe
um numero menor ou igual a 25 e calcula o seu fatorial.
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fat = 0;
        int num = 0;

        System.out.println("digite um numero ");
        num = scan.nextInt();

        while (num > 1) {

        }
        System.out.println( " O fatorial de " + num + "é " + fat);
    }

}

