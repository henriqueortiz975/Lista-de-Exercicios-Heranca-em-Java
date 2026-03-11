package exercicio9_sistema_de_transporte;

public class Transporte {
    private String capacidade;
    private double velocidade;
    
    public Transporte(String capacidade, double velocidade){
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }
    
    public void setCapacidade(String capacidade){
        this.capacidade = capacidade;
    }
    
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public String getCapacidade(){
        return capacidade;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    public void exibirDados(){
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Velocidade: " + getVelocidade() + "Km/h");
    }
    
}
