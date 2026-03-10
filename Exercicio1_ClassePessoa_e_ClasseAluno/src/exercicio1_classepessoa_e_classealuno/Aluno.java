package exercicio1_classepessoa_e_classealuno;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public String getMatricula(){
        return matricula;
    }

        
    
}
