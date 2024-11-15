import java.util.Random;

public class MetodosOrdenacao {
    public static int tam = 10;
    public static void main(String[] args) {
        int [] vetor = new int [tam];
        System.out.println("\nInsertion Sort");
        preencher(vetor);
        exibir (vetor);
        insertionSort(vetor, tam);
        exibir (vetor);

        System.out.println("\nSelection sort");
        preencher(vetor);
        exibir (vetor);
        selectionSort(vetor, tam);
        exibir (vetor);

        System.out.println("\nBubble sort");
        preencher(vetor);
        exibir (vetor);
        //bubbleSort(vetor, tam);
        exibir (vetor);

    }

    public static void insertionSort (int [] vetor, int tam){ // *REVISARRRRRRRR*
        for (int i = 1; i < tam; i++) {
            int aux = vetor[i];
            int j = i-1;
            while (j >= 0 && aux < vetor[j]){
                vetor [j+1] = vetor [j];
                --j;
            }
            vetor[j+1] = aux;
        }
    }

   public static void selectionSort(int [] vetor, int tam){ // *REVISARRRRRRRR*
        for (int i = 0; i < tam - 1; ++i){
            int menor = i;
            for (int j = i+1; j < tam; ++j){
                if (vetor [j] < vetor [menor]){
                    menor = j;
                }
            }
            int aux = vetor [i];
            vetor [i] = vetor [menor];
            vetor [menor] = aux;
        }
   }

//    public static void bubbleSort (int[] v, int tam) { // *ESTUDARRRRRR*
//        int fim = tam - 2, pos = 0;
//        boolean trocou = true;
//        while (trocou) {
//            trocou = false;
//            for (int i = 0; i <= fim; i++) {
//                if (v[i] > v[i+1]) {
//                    int aux = v[i];
//                    v[i] = v[i + 1];
//                    v[i+1] = aux;
//                    pos = i;
//                    trocou = true;
//                }
//            }
//            fim = pos-1;
//        }
//    }

    public static void preencher (int [] vetor){
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = gerador.nextInt(10) + 1;
        }
    }

    public static void exibir (int [] vetor){
        System.out.print("{");
        if (vetor.length != 0){
            System.out.print(" " + vetor[0]);
            for (int i = 1; i < vetor.length; i++) {
                System.out.print(", " + vetor[i]);
            }
        }
        System.out.println(" }");
    }
}
