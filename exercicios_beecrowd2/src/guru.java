import java.util.Scanner;
public class guru {
    public static final Scanner ler = new Scanner (System.in);
    public static int tam = 8;
    public static void main(String[] args) {

        System.out.print("Digite um nome: ");
        String nome = ler.nextLine();
        int [] numeros = conversor(nome);

        System.out.println("\nValores numéricos correspondentes:");
        imprimir(numeros);

        int soma = somar(numeros);
        System.out.println(soma);

        System.out.println(reduzirParaUmDigito(soma));

    }

    public static void imprimir (char []v){
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Vetor na posicao [%d] = %c\n", i, v[i]);
        }
    }

    public static void imprimir (int []v){
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Vetor na posicao [%d] = %d\n", i, v[i]);
        }
    }

    public static int [] conversor(String nome){
        nome = nome.toLowerCase();
        char [] vChar = nome.toCharArray();
        int [] numeros = new int [vChar.length];

        for (int i = 0; i < numeros.length; i++) {

            switch (vChar[i]){
                case 'a': case 'j': case 's':
                    numeros[i] = 1;
                    break;
                case 'b': case 'k': case 't':
                    numeros[i] = 2;
                    break;
                case 'c': case 'l': case 'u': case 'ç':
                    numeros[i] = 3;
                    break;
                case 'd': case 'm': case 'v':
                    numeros[i] = 4;
                    break;
                case 'e': case 'n': case 'w':
                    numeros[i] = 5;
                    break;
                case 'f': case 'o': case 'x':
                    numeros[i] = 6;
                    break;
                case 'g': case 'p': case 'y':
                    numeros[i] = 7;
                    break;
                case 'h': case 'q': case 'z':
                    numeros[i] = 8;
                    break;
                case 'i': case 'r':
                    numeros[i] = 9;
                    break;
                default:
                    numeros[i] = 0;
                    break;
            }
        }
        return numeros;
    }

    public static int somar (int [] v){
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static int reduzirParaUmDigito(int numero) {
        while (numero >= 10) {
            int soma = 0;
            while (numero > 0) {
                soma += numero % 10;  // Soma os dígitos
                numero /= 10;          // Remove o último dígito
            }
            numero = soma;  // Atualiza o número com a soma dos dígitos
        }
        return numero;  // Retorna o número com um único dígito
    }



}
