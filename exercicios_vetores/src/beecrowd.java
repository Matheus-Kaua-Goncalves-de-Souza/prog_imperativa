import java.util.Scanner;
public class beecrowd {
    public static int tamanho = 10;
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[tamanho];
        ler(vetor);
        imprimir(vetor);

    }
    public static void ler(int[] vetor) {
        for (int i = 0; i < tamanho; i++) {
            System.out.printf ("Informe o valor %d: " , i+1);
            vetor[i] = ler.nextInt();
            if (vetor[i] < 1) {
                vetor[i] = 1;
            }
        }
    }
    public static void imprimir(int[] vetor){
        for (int i = 0; i < tamanho; i++) {
            System.out.println("X" + "["+i+"]" + " = " + vetor[i] );
        }
    }
}
