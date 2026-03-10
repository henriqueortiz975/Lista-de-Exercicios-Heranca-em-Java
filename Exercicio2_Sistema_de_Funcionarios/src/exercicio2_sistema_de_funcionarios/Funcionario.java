package exercicio2_sistema_de_funcionarios;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }  
}
