import java.util.Scanner;
public class preenc_vetor2 {
    public static int tam = 1000;
    public static final Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int t = ler.nextInt();
        int [] vetor1 = new int[t];
        int [] vetor2 = new int[tam];
        somaVetor1(vetor1,t);
        preencherVetor2(vetor1, vetor2);
        imprimirVetor(vetor2);
    }

    public static void imprimirVetor(int [] vetor2) {
        for (int i = 0; i < tam; i++) {
            System.out.println("N" + "[" + i + "]" + " = " + vetor2[i]);
        }
    }

    public static void somaVetor1(int [] vetor1, int t) {
        for (int i = 1; i < t; i++) {
            vetor1[i] = vetor1[i - 1] + 1;
        }
    }

    public static void preencherVetor2 (int [] vetor1, int [] vetor2){
        for (int i = 0; i < tam; i++) {
            vetor2[i] = vetor1[i % vetor1.length];
        }
    }
}
