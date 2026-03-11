package exercicio9_sistema_de_transporte;

public class Aviao extends Transporte{
    private String companhiaAerea;
    
    public Aviao(String capacidade, double velocidade, String companhiaAerea) {
        super(capacidade, velocidade);
        this.companhiaAerea = companhiaAerea;
    }
    
    public void setCompanhiaAerea(String companhiaAerea){
        this.companhiaAerea = companhiaAerea;
    }
    
    public String getCompanhiaAerea(){
        return companhiaAerea;
    }
    
    public void exibirDados(){
        System.out.println("Companhia aerea: " + getCompanhiaAerea());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Velocidade: " + getVelocidade() + "Km/h");
    }
    
}
