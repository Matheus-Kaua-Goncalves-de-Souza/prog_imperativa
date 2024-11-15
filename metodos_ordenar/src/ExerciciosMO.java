import java.util.Random;
class ExerciciosMO {
    public static final Random gerar = new Random();
    public static int tam = 50;
    public static void main(String[] args) {
        int [] v = new int [tam];
        int [] v2 = new int [tam];

        System.out.println("Vetor desordenado");
        preencher(v, tam);
        imprimirTudo(v, tam);

        BubbleSort(v, tam);

        System.out.println("Vetor ordenado");
        imprimirTudo(v, tam);

        System.out.print("Maior e menor elemento (respectivamente): ");
        imprimirMenorMaior(v, tam);

        System.out.println("Mediana: " + mediana(v));

        listagem(v, tam);

        novo (v, tam);



    }

    public static void preencher (int [] vetor, int tam){//preencha com valores aleatórios entre 1 e 10
        for (int i = 0; i < tam; i++) {
            vetor[i] = gerar.nextInt(10) + 1;
        }
    }

    public static void BubbleSort (int[] vetor, int tam) {
        int fim = tam - 2, pos = 0;
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = 0; i <= fim; i++) {
                if (vetor[i] > vetor[i+1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i+1] = aux;
                    pos = i;
                    trocou = true;
                }
            }
            fim = pos-1;
        }
    }

    public static void imprimirMenorMaior(int [] v, int tam){
        System.out.println(v[0] + ", " + v[tam-1]+".");
    }

    public static void imprimirTudo (int [] v, int tam){
        System.out.print("{");
        if (v.length != 0) {
            System.out.print(" " + v[0]);
            for (int i = 1; i < tam; ++i) {
                System.out.print(", " + v[i]);
            }
        }
        System.out.println(" }");
    }

    public static double mediana (int [] v){
        if (tam % 2 == 1){
            return v[tam / 2];
        }
        else {
            return (v[tam / 2] + v[tam / 2-1]) / 2.0;
        }
    }

    public static void listagem (int [] v, int tam){// Imprima uma listagem onde cada linha tem um valor que está no vetor e a quantidade de vezes que esse valor aparece no vetor
        int cont = 1;
        for (int i = 0; i < tam-1; i++) {
            if (v[i] == v[i+1]){
                cont++;
            }

            else {
                System.out.println(v[i] + " aparece " + cont);
                cont = 1;
            }
        }
        System.out.println(v[tam-1] + " aparece " + cont);

    }

    public static void novo (int [] v, int tam) { //Crie um novo vetor que não tenha valores repetidos
        int cont = 1;
        for (int i = 1; i < tam; i++) {
            if (v[i] != v[i-1]){
                cont++;
            }
        }

        int [] v2 = new int [cont];

        v2[0] = v[0];
        int j = 1;
        for (int i = 1; i < tam; i++) {
            if (v[i] != v[i-1]){
                v2[j] = v[i];
                j++;
            }
        }
        imprimirTudo(v2, cont);
    }
}
