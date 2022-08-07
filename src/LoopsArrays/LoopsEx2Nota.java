package LoopsArrays;
import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class LoopsEx2Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10 ) {
            System.out.println("Nota invalida! Digite novamente! ");
            nota = scan.nextInt();


        }
        System.out.println(" Enfim, acabou xuxu ^^)");
    }


}



