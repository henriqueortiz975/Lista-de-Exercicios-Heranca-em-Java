package exercicio9_sistema_de_transporte;

public class Onibus extends Transporte{
    private String numeroLinha;
    
    public Onibus(String capacidade, double velocidade, String numeroLinha) {
        super(capacidade, velocidade);
        this.numeroLinha = numeroLinha;
    }
    
    public void setNumeroLinha(String numeroLinha){
        this.numeroLinha = numeroLinha;
    }
    
    public String getNumeroLinha(){
        return numeroLinha;
    }
    
    public void exibirDados(){
        System.out.println("Numero linha: " + getNumeroLinha());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Velocidade: " + getVelocidade() + "Km/h");
    }
    
}
