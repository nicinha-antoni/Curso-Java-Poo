package MiniDesafiosIniciais;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String opcao = " ";

        do {
            System.out.println("_________________________________");
            System.out.println(" 0- Sair ");
            System.out.println(" 1- Fatorial");
            System.out.println(" 2- Soma ");
            System.out.println(" 3- Multiplicacao ");
            System.out.println(" 4- Divisao ");
            System.out.println(" 5- Subtracao ");
            System.out.println("_________________________________");

            opcao = scan.nextLine();
            if (opcao.equals("0")) {
                System.out.println(" Voce escolheu sair!");
            } else if (opcao.equals("1")) {
                System.out.println("Digite um numero entre 1 e 20 para calcular o fatorial: ");
                int mrecebido = Integer.parseInt(scan.nextLine());
                long fatorial = FuncoesCalculadora.factorial(mrecebido);
                System.out.println(" o fatorial de: " + mrecebido + " é " + fatorial);
            } else if (opcao.equals("2")) {
                double x = 0;
                double y = 0;

                System.out.println(" Informe o primeiro valor: ");
                x = Double.parseDouble(scan.nextLine());
                System.out.println("Informe o segundo valor: ");
                y = Double.parseDouble(scan.nextLine());
                System.out.println(" A soma de " + x + " + " + y + " é igual a " + FuncoesCalculadora.soma(x, y));

            } else if (opcao.equals("3")) {
                double x = 0;
                double y = 0;
                System.out.println(" Informe o primeiro valor: ");
                x = Double.parseDouble(scan.nextLine());
                System.out.println("Informe o segundo valor: ");
                y = Double.parseDouble(scan.nextLine());
                System.out.println(" A multiplicacao de " + x + " x " + y + " é igual a " + FuncoesCalculadora.multiplicacao(x, y));

            } else if (opcao.equals("4")) {
                double x = 0;
                double y = 0;
                System.out.println(" Informe o primeiro valor: ");
                x = Double.parseDouble(scan.nextLine());
                System.out.println("Informe o segundo valor: ");
                y = Double.parseDouble(scan.nextLine());
                System.out.println(" A Divisao de " + x + " / " + y + " é igual a " + FuncoesCalculadora.divisao(x, y));

            } else if (opcao.equals("5")) {
                double x = 0;
                double y = 0;
                System.out.println(" Informe o primeiro valor: ");
                x = Double.parseDouble(scan.nextLine());
                System.out.println("Informe o segundo valor: ");
                y = Double.parseDouble(scan.nextLine());
                System.out.println(" A Subtracao de " + x + " - " + y + " é igual a " + FuncoesCalculadora.subtracao(x, y));


            } else {
                System.out.println("Digite uma opcao valida! ");

            }

        }
        while (!opcao.equalsIgnoreCase("0")); // "!" esta invertendo a afirmativa. Comparação entre uma string e tipo primitivo.


        System.out.println(" ate a proxima xuxu ^^ ");

    }


}
