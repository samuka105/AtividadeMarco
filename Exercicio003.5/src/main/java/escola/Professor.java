package escola;

public class Professor extends Pessoa{

    private String titulacao;

    public Professor(String nome, String titulacao) {
        super(nome);
        this.titulacao = titulacao;
    }

    public Professor(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void imprimeProfessor()
    {
        System.out.println("Imprime professor");
        System.out.println(getNome());
        System.out.println(getTitulacao());
    }
}
