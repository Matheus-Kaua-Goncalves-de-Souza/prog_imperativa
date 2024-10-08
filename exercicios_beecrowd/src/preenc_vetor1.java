import java.util.Scanner;
public class preenc_vetor1 {
    public static int tam = 10;
    public static final Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[tam];
        leia(vetor);
        multil(vetor);
        imprimir(vetor);
    }

// le um numero e armazena no indice 0 do veotr
    public static void leia (int [] vetor) {
        System.out.print("informe um numero(<=50): ");
        vetor[0] = ler.nextInt();
    }
// percorre o vetor e multiplica por 2 o valor no indice anterior
    public static void multil (int [] vetor) {
        for (int i = 1; i < tam; i++) {
            vetor[i]= vetor[(i-1)]*2;
        }
    }
// imprime o vetor
    public static void imprimir (int [] vetor) {
        for (int i = 0; i < tam; i++) {
            System.out.println("X" + "[" + i + "]" + " = " + vetor[i]);
        }
    }
}
