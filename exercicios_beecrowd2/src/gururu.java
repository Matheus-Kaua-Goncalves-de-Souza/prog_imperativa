//codigo p rodar no beecrowd
import java.util.Scanner;

public class gururu {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Processa cada linha de entrada enquanto houver conteúdo
        while (ler.hasNextLine()) {
            String nome = ler.nextLine().trim();

            // Verifica se a linha está vazia (caso o usuário tenha terminado a entrada)
            if (nome.isEmpty()) {
                break;
            }

            nome = nome.toLowerCase(); // Converte o nome para letras minúsculas
            int[] numerosNome = new int[nome.length()];

            // Preenche o array numerosNome com valores baseados nos caracteres de nome
            for (int i = 0; i < nome.length(); i++) {
                char c = nome.charAt(i);
                switch (c) {
                    case 'a': case 'j': case 's':
                        numerosNome[i] = 1;
                        break;
                    case 'b': case 'k': case 't':
                        numerosNome[i] = 2;
                        break;
                    case 'c': case 'l': case 'u':
                        numerosNome[i] = 3;
                        break;
                    case 'd': case 'm': case 'v':
                        numerosNome[i] = 4;
                        break;
                    case 'e': case 'n': case 'w':
                        numerosNome[i] = 5;
                        break;
                    case 'f': case 'o': case 'x':
                        numerosNome[i] = 6;
                        break;
                    case 'g': case 'p': case 'y':
                        numerosNome[i] = 7;
                        break;
                    case 'h': case 'q': case 'z':
                        numerosNome[i] = 8;
                        break;
                    case 'i': case 'r':
                        numerosNome[i] = 9;
                        break;
                    default:
                        numerosNome[i] = 0;
                        break;
                }
            }

            // Calcula a soma total do vetor
            int somaTotal = somarVetor(numerosNome);

            // Reduz a soma a um único dígito
            int digitoFinal = reduzirParaUmDigito(somaTotal);

            // Imprime o número da sorte final para o nome
            System.out.println(digitoFinal);
        }

        ler.close();
    }

    // Soma todos os elementos de um vetor
    public static int somarVetor(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma;
    }

    // Função que reduz um número a um único dígito somando repetidamente os dígitos
    public static int reduzirParaUmDigito(int numero) {
        while (numero >= 10) { // Continua até que o número tenha apenas um dígito
            numero = somarDigitos(numero);
        }
        return numero;
    }

    // Função auxiliar para somar os dígitos de um número
    public static int somarDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; // Adiciona o último dígito à soma
            numero /= 10; // Remove o último dígito
        }
        return soma;
    }
}
