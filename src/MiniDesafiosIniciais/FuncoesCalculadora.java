package MiniDesafiosIniciais;

public class FuncoesCalculadora {
    public static double soma (double x, double y) {
        return x + y;
    }

    public static double multiplicacao (double x, double y){
        return x * y;
    }
    public static double divisao ( double x, double y){
        return x / y;
    }
    public static double subtracao (double x, double y){
        return  x - y;
    }

    public static long factorial (int n ) {
        long resposta = 1;

        if ( n < 2){
            return 1;
        }

        for (int i = 1; i <= n; i++){
            resposta = resposta * i;
        }

        return resposta;
    }
    public static long factorialWhile (int n ) {
        long resposta = 1;

        if ( n < 2){
            return 1;
        }

        int i = 1;
        while (n >= 1) {
            resposta = resposta * i;
            i++;
            n--;
        }

        return resposta;
    }

}
