import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome;
        Integer rg;
        Date dataNascimento;

        System.out.println("Infome o nome do aluno: ");
        nome = teclado.next();

        System.out.println("Informe o rg do aluno: ");
        rg = teclado.nextInt();

        System.out.println("Informe a data de nascimento do aluno: 12345  ");
        dataNascimento = formataData(teclado.next());

        Aluno aluno = new Aluno(1, nome, rg, dataNascimento);

        System.out.println("Informe o número da matrícula: ");
        aluno.setMatricula(teclado.nextInt());

        /*************
         * Professor *
         ************/
            System.out.println("Informe o nome do professor: ");
            nome = teclado.next();

            System.out.println("Informe o rg do  professor: ");
            rg = teclado.nextInt();

            System.out.println("Infome a data de nascimento do professor: ");
            dataNascimento = formataData(teclado.next());

            Professor professor = new Professor(1, nome, rg, dataNascimento);

            System.out.println("Informe o salário do professor: ");
            professor.setSalario(teclado.nextDouble());

            System.out.println("Informe a disciplina que o professor leciona: ");
            professor.setDisciplina(teclado.next());

        /**************************
         * Apresentar informações *
          **************************/
        System.out.println("***** Informações professor **********");
        System.out.println("Código: " + professor.getId() + " nome: " + professor.getNome() + " RG: " + professor.getRg());
        System.out.println(" Disciplina: " + professor.getDisciplina() + " Salário: " + professor.getSalario());
        System.out.println(" Data de Nascimento: " + professor.getDataNascimento());


        System.out.println("***** Informações Aluno **********");
        System.out.println("Código: " + aluno.getId() + " nome: " + aluno.getNome() + " RG: " + aluno.getRg());
        System.out.println(" Matrícula: " + aluno.getMatricula());
        System.out.println(" Data de Nascimento: " + aluno.getDataNascimento());





    }

    public static Date formataData(String data){
        Date dataRetorno = new Date();
        try {
            DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            dataRetorno = dataFormatada.parse(data);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return dataRetorno;

    }



}
