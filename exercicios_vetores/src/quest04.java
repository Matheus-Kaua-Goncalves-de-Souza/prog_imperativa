import java.util.Scanner;
public class quest04 {
    public static int tam = 8;
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.printf("Informe o valor %d: ", i+1);
            vetor[i] = ler.nextInt();
        }

    }
    public static int busca (int[]vetor, int x){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == x){
                return i;
            }
        }
        return -1;
    }
}
