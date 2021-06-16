package escola;

public class AlunoGraduacao extends Aluno{

    public boolean aprovadoGraduacao{

        if(this.media < 7)
        {
            return false;
        }

        return true;
    }
}
