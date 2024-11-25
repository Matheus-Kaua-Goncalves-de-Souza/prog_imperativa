public class Aluno {
    String nome;
    int matricula;
    double media;

    public Aluno (String nome, int matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String toString(){
        return String.format("{Aluno: %s, matrícula: %d, teve média final %.2f}" , nome , matricula, media);
    }
}
