import java.util.Date;

public class Pessoa {
    private int id;
    private String nome;
    private Integer rg;
    private Date dataNascimento;

    public Pessoa(int id, String nome, Integer rg, Date dataNascimento){
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
