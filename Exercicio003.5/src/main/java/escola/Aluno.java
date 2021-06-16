package escola;

public class Aluno extends Pessoa{

    private float Nota1;
    private float Nota2;
    private float media;
    private String matricula;

    public Aluno(String nome, float nota1, float nota2, String matricula) {
        super(nome);
        Nota1 = nota1;
        Nota2 = nota2;
        this.media = (nota1 + nota2)/2;
        this.matricula = matricula;
    }

    public float getNota1() {
        return Nota1;
    }

    public float getNota2() {
        return Nota2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota1(float nota1) {
        Nota1 = nota1;
    }

    public void setNota2(float nota2) {
        Nota2 = nota2;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getMedia() {
        return media;
    }
}
