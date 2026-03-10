package exercicio1_classepessoa_e_classealuno;

public class Exercicio1_ClassePessoa_e_ClasseAluno {

    public static void main(String[] args) {
        Aluno objaluno = new Aluno("Henrique Ibarra", 17, "Informatica", "2022321");
        System.out.println("Nome: " + objaluno.getNome());
        System.out.println("Idade: " + objaluno.getIdade());
        System.out.println("Curso: " + objaluno.getCurso());
        System.out.println("Matricula: " + objaluno.getMatricula());

    }
    
}
