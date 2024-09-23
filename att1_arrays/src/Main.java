import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        System.out.println("Número aleatório gerado: " + numeroAleatorio);
    }
}



