import java.util.Scanner;

public class Main {
    public static int QTD_ALUNOS = 10;
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = new int[QTD_ALUNOS];

        for (int i = 0; i < QTD_ALUNOS; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            num[i] = ler.nextInt();
        }

        //ordenado
        if (ordenado(num)) {
            System.out.println("O vetor está ordenado.");
        } else {
            System.out.println("O vetor não está ordenado.");
        }

        // Inicia loop para busca de valores
        String continuar;
        do {
            System.out.print("Digite o valor a ser buscado: ");
            int valorBuscado = ler.nextInt();

            // tipo de busca
            int posicao;
            if (ordenado(num)) {
                posicao = buscaBinaria(num, valorBuscado);
            } else {
                posicao = buscaSequencial(num, valorBuscado);
            }

            //resultado da busca
            if (posicao != -1) {
                System.out.println("Valor encontrado na posição: " + posicao);
            } else {
                System.out.println("Valor não encontrado no vetor.");
            }

            System.out.print("Deseja continuar buscando (s/n)? ");
            continuar = ler.next();
        } while (continuar.equalsIgnoreCase("s"));

        ler.close();
    }


    public static boolean ordenado(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static int buscaSequencial(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
