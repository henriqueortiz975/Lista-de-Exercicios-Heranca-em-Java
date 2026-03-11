package exercicio8_dispositivos;

public class Dispositivo {
    private String marca;
    private String modelo;
    
    public Dispositivo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
    
}
