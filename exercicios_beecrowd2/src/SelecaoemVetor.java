import java.util.Scanner;
public class SelecaoemVetor {
    public static final Scanner ler = new Scanner(System.in);
    public static int tam = 100;
    public static void main(String[] args) {
        double [] v = new double[tam];

        preencher(v);
        exibir(v);

    }

    public static void preencher (double [] v){
        for (int i = 0; i < tam; i++) {
            v[i] = ler.nextDouble();
        }
    }

    public static void exibir (double [] v){
        for (int i = 0; i < tam; i++) {
            if (v[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, v[i]);
            }

        }
    }


}
