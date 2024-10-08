import java.util.Scanner;
public class quest03 {
    public static Scanner ler = new Scanner(System.in);
    public static int tamanho = 4;
    public static void main(String[] args) {
        int[] num = new int [tamanho];
        int[] quadrado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe o numero %d: " , i+1);
            num[i] = ler.nextInt();
            quadrado[i] = num[i] * num[i];
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print(num[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < tamanho; i++) {
            System.out.print(quadrado[i] + "  ");
        }
    }
}
