import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static final int QTD_PESSOAS = 10;

    public static void main(String[] args) {
        Aluno [] alunos = new Aluno [QTD_PESSOAS];
        lerAlunos(alunos);


        contagem(alunos);

    }

    public static void imprimirApro (Aluno[] alunos){
        System.out.println("=============APROVADOS=============");
        for (int i = 0; i < alunos.length; ++i) {
            System.out.println(alunos[i]);
        }
    }

    public static void imprimirRepro (Aluno[] alunos){
        System.out.println("=============REPROVADOS=============");
        for (int i = 0; i < alunos.length; ++i) {
            System.out.println(alunos[i]);
        }
    }

    public static void lerAlunos (Aluno[] alunos) {
        for (int i = 0; i < alunos.length; ++i) {
            System.out.println("Digite os dados do " + (i + 1) + "ª aluno");
            alunos[i] = lerAluno();
        }
    }

    public static Aluno lerAluno() {
        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("Matrícula: ");
        int matricula = ler.nextInt();
        System.out.print("Média final: ");
        double media = ler.nextDouble();
        ler.nextLine();
        return new Aluno(nome, matricula, media);
    }

    public static void contagem (Aluno [] alunos){
        int contA = 0;
        int contR = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].media >= 5){
                contA++;
            }
            else {
                contR++;
            }
        }
        Aluno [] aprovados = new Aluno [contA];
        Aluno [] reprovados = new Aluno [contR];

        int indexA = 0;
        int indexR = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].media >= 5){
                aprovados[indexA] = alunos[i];
                indexA++;
            }
            else {
                reprovados[indexR] = alunos[i];
                indexR++;
            }
        }
        imprimirApro(aprovados);
        imprimirRepro(reprovados);

    }



}