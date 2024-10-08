import java.util.Scanner;
public class quest2 {
    public static int tamanho = 6;
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.printf ("Informe o valor %d: " , i+1);
            vetor[i] = ler.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }
}
