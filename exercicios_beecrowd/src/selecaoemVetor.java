import java.util.Scanner;
public class selecaoemVetor {
    public static final Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vetorOrdenado = new int[vetor.length];
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            vetor[i] = ler.nextInt();
            for (int j = i+1; j < 5; j++) {
                if (vetor[j] == vetor[i]) {
                    vetorOrdenado[i] = vetor[i];
                }
            }
        }
        for (int i = 0; i < cont; i++) {
            System.out.print(vetorOrdenado[i] + " ");
        }
    }
}
