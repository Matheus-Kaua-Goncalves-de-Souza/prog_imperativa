
import java.util.Scanner;
public class preenc_vetor3 {
    public static int tam = 100;
    public static final Scanner ler = new Scanner(System.in);

    public static void main(String[] args)   {
        double [] vetor = new double[tam];
        vetor[0] = ler.nextDouble();
        divisao(vetor);
        imprimeVetor(vetor);
    }

    public static void divisao(double [] vetor){
        for (int i = 1; i < tam; i++){
            vetor[i] = vetor[i-1] / 2;
        }
    }

    public static void imprimeVetor(double [] vetor){
        for (int i = 0; i < tam; i++){
            System.out.printf("N[%d] = %.4f\n", i , vetor[i]);
        }
    }
}
