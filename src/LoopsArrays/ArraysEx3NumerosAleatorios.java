package LoopsArrays;
import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class ArraysEx3NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nsAleatorios = new int[20];

        for (int i = 0; i < nsAleatorios.length; i++) {
            int numero = random.nextInt(100);
            nsAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : nsAleatorios){
            System.out.println(numero + " ");
        }
        System.out.println("\n Antecessor dos numeros aleatorios: ");
        for (int numero : nsAleatorios) {
            System.out.println((numero-1) + " ");
        }

        System.out.println("\n Acabou xuxu ^^) ");



    }


}
