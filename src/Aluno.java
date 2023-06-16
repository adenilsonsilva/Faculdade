import java.util.Date;

public class Aluno extends Pessoa{

    public Aluno(int id, String nome, Integer rg, Date dataNascimento) {
        super(id, nome, rg, dataNascimento);
    }

    private Integer matricula;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
