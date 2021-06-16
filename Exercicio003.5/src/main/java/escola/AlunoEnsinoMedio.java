package escola;

public class AlunoEnsinoMedio extends Aluno{

    public boolean aprovadoEnsinoMedio{

        if(this.media < 6)
        {
            return false;
        }

        return true;

    }
}
