import java.util.Scanner;

public class fibonacci {
    public static final Scanner ler = new Scanner(System.in);
    public static int tam = 61;

    public static void main(String[] args) {
        long [] fibo = new long[tam];
        calculo(fibo, tam);
        int test = ler.nextInt();
        for (int i = 0; i < test; i++) {
            int valor = ler.nextInt();
            imprime(fibo, valor);
        }

    }
    public static void calculo (long [] fibo, int tam){
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < tam; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }

    public static void imprime (long [] fibo, int valor){
        System.out.printf("Fib(%d) = %d\n", valor, fibo[valor]);

    }
}
