package exercicio4_veiculos;

public class Carro extends Veiculo{
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }
    
    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }
    
    public int getNumeroPortas(){
        return numeroPortas;
    }
    
    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de portas: " + getNumeroPortas());
    }
}
