import java.util.Scanner;
public class trocaemVetor {
    public static int tam = 20;
    public static final Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int [] vetor = new int [tam];
        lerVetor(vetor);
        troca(vetor);
        imprimirVetor(vetor);
    }

    public static void lerVetor(int [] vetor) {
        for (int i = 0; i < tam; i++) {
            vetor[i] = ler.nextInt();
        }
    }

    public static void troca(int[] vetor) {
        for (int i = 0; i < tam/2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[(tam-1)- i];
            vetor[tam-1 - i] = temp;
        }
    }

    public static void imprimirVetor(int [] vetor) {
        for (int i = 0; i < tam; i++) {
            System.out.println("N" + "[" + i + "]" + " = " + vetor[i]);
        }
    }
}
