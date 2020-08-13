package Aula2;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos");

        aluno.setEndereco("Rua Alameda, 123");
        aluno.setMatricula(112);

        Professor prof = new Professor("Edson");

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getEndereco());
    }
}
