package escola;

public class Aluno extends Pessoa{

    private float Nota1;
    private float Nota2;
    private float media;
    private string matricula;

    public Aluno(float nota1, float nota2, string matricula) {
        Nota1 = nota1;
        Nota2 = nota2;
        media = (nota1 + nota2)/2;
        this.matricula = matricula;
    }

    public float getNota1() {
        return Nota1;
    }

    public float getNota2() {
        return Nota2;
    }

    public string getMatricula() {
        return matricula;
    }

    public void setNota1(float nota1) {
        Nota1 = nota1;
    }

    public void setNota2(float nota2) {
        Nota2 = nota2;
    }

    public void setMatricula(string matricula) {
        this.matricula = matricula;
    }


}
