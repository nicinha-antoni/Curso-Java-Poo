package LoopsArrays;
import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class ArraysEx4ArrayMultidimensional {
    public static void main(String[] args) {

        // Declarando as variáveis
        Random random = new Random();
        int [][] M = new int [4] [8];
        int row = -1, colluna = -1;
        System.out.println(M[0].length);


        // Populando a matriz
        for (int i = 0; i < M.length; i++){
            for ( int j= 0; j < M[i].length; j++) {
                int numeroAletario = random.nextInt(90);
                M[i][j] = numeroAletario;
                if(numeroAletario == 6){
                    row = i;
                    colluna = j;
                }
            }
        }

        //Exibindo os valores da matriz
        System.out.println("Matriz: ");
        for (int [] linha : M ) {
            for (int coluna = 0; coluna < linha.length; coluna++) {
                System.out.printf("%02d", linha [coluna]);
                if(coluna < linha.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n Acabou Xuxu ^^) ");
        if (row > -1 && colluna > -1){
            System.out.println("numero 6 esta na posição: [" + row +"]["+ colluna+"]");
        }
        else {
            System.out.println("Nao há 6 na matriz ");
        }



    }



}
