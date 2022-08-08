package MiniDesafiosIniciais;

import java.util.Random;
import java.util.Scanner;

import static MiniDesafiosIniciais.FuncoesCalculadora.factorialWhile;

/*Faca um programa que leia 1000 (mil) numeros inteiros e mostre o menor numero.
Apenas o menor numero deve ser impresso.
 */

public class Maior {
    public static <menor> void main(String[] args) {
        Scanner scan = new Scanner(System.in);


//        int grande = 2147483647;
//        System.out.println(grande);
//        grande++;
//        System.out.println(grande);
//        System.out.println(Integer.MAX_VALUE); a expressao MAX_VALUE mostra a quantidade de digitos possivel dentro do tipo

        Random r = new Random();
        int menor = 0;
        int quant = 0;
        int maior = 0;
        int x = 0;
        int npares = 0;
        int nimpares = 0;
        int menorqdez = 0;
        int maiorq90 = 0;
        int mult5 = 0;
        String quintuplos = "[";
        long fatorial = 0;

        System.out.print("Quantos numeros serao informados? ");
        quant = scan.nextInt();

        for (int i = 0; i < quant ; i++) {
            System.out.print(" Digite o " + (i+ 1) + "º Numero: " );
            x = r.nextInt(1000); // o sistema atribui valores aleatorios automaticamente
            //            x = scan.nextInt(); // o sistema nao atribui valores, tem que se atribuir manualmente

            if (x < 21){
                fatorial = factorialWhile(x);
                System.out.println("o Fatorial de " + x + " é " + fatorial);

            }
            else {
                System.out.println(x);
            }


            if ( i == 0) {
            menor = x ;
            maior = x;
            }

            if (x < menor){
                menor = x;
            }

            if (x > maior){
                maior = x;
            }

            if (x % 2 == 1){ //Verificando se é impar
                nimpares++;
            }

            else {
            npares ++;
            }

            if ( x < 10) {
                menorqdez++;
            }

            if ( x > 90){
                maiorq90++;
            }

            if (x % 5 == 0){
                mult5++;
                quintuplos += x+ " ";
            }


        }

        quintuplos += "]";

        System.out.println("O menor numero é: " + menor);
        System.out.println("O maior numero é: " + maior);
        System.out.println("Existem: " + npares + " Numeros pares");
        System.out.println("Existem: " + nimpares + " Numeros impares");
        System.out.println("Numeros menores que 10 sao: " + menorqdez);
        System.out.println("Numeros maiores que 90 sao: " + maiorq90);
        System.out.println("Numeros multiplos por 5: " + mult5);
        System.out.println("Numeros quintuplos: " + quintuplos);


    }



}



