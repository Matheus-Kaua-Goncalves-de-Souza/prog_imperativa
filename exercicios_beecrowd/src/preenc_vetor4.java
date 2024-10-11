import java.util.Scanner;
public class preenc_vetor4 {
    public static int tam = 5;
    public static final Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int [] vpar = new int [tam];
        int [] vimpar = new int[tam];
        int contpar = 0;
        int contimpar = 0;

        for (int i = 0; i < 15; i++) {
            int valor = ler.nextInt();
            if (valor % 2 == 0){
                vpar [contpar] = valor;
                contpar++;
                if (contpar == tam){
                    imprimirVetor(vpar, "par");
                    contpar = 0;
                }
            }
            else {
                vimpar[contimpar] = valor;
                contimpar++;
                if (contimpar == tam){
                    imprimirVetor(vimpar, "impar");
                    contimpar = 0;
                }
            }
        }
        imprimirVetorRestante(vimpar, contimpar, "impar");
        imprimirVetorRestante(vpar, contpar, "par");
    }
    public static void imprimirVetorRestante(int[] vetor, int tam, String tipo) {
        for (int i = 0; i < tam; i++) {
            System.out.println(tipo + "[" + i + "] = " + vetor[i]);
        }
    }
    public static void imprimirVetor(int[] vetor, String tipo) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(tipo + "[" + i + "] = " + vetor[i]);
        }
    }
}

