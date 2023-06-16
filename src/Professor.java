import java.util.Date;
public class Professor extends Pessoa{

    public Professor(int id, String nome, Integer rg, Date dataNascimento) {
        super(id, nome, rg, dataNascimento);
    }

    private Double salario;
    private String disciplina;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
