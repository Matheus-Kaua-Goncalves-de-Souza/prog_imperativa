import java.util.Scanner;
public class subst_vetor1 {
    public static int tam = 10;
    public static final Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[tam];
        ler(vetor);
        imprimirVetor(vetor);

    }
    public static void ler(int[] vetor) {
        for (int i = 0; i < tam; i++) {
            System.out.printf("Informe o valor %d: " , i+1);
            vetor[i] = ler.nextInt();
            if(vetor[i] < 1){
                vetor[i] = 1;
            }
        }
    }
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < tam; i++) {
            System.out.println("X" + "[" + i + "]" + " = " + vetor[i]);
        }
    }
}