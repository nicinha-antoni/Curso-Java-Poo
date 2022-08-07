package LoopsArrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class ArraysEx2Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtConsoante = 0;
        int count = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                qtConsoante++;
            }
            count++;
        }
        while (count < consoantes.length);

        System.out.println(" Consoantes: ");
        for (String consoante : consoantes) {
            if ( consoante != null)
                System.out.println(consoante + "  ");

        }

        System.out.println( " Quantidade de consoantes: " + qtConsoante);
        System.out.println("quantidade de letras digitadas: " + consoantes.length);
        System.out.println("\n Acabou xuxu ^^) ");
    }



}
