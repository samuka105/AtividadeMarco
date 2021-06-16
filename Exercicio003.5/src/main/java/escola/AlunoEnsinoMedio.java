package escola;

public class AlunoEnsinoMedio extends Aluno{

    public AlunoEnsinoMedio(String nome, float nota1, float nota2, String matricula) {
        super(nome, nota1, nota2, matricula);
    }

    public boolean aprovadoEnsinoMedio(){

        if(this.getMedia() < 6)
        {
            return false;
        }

        return true;

    }

    public void imprimeAlunoEnsinoMedio()
    {
        System.out.println("Imprime aluno EM");
        System.out.println(getNome());
        System.out.println(getMatricula());
        System.out.println(aprovadoEnsinoMedio());
    }
}
