package escola;

public class AlunoGraduacao extends Aluno{

    public AlunoGraduacao(float nota1, float nota2, String matricula) {
        super(nota1, nota2, matricula);
    }

    public boolean aprovadoGraduacao(){

        if(this.getMedia() < 7)
        {
            return false;
        }

        return true;
    }

    public void imprimeAlunoGraduacao()
    {
        System.out.println("Aluno Graduacao");
        System.out.println(getNome());
        System.out.println(getMatricula());
        System.out.println(aprovadoGraduacao());
    }
}
