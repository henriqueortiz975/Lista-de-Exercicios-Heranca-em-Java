package exercicio8_dispositivos;

public class Exercicio8_Dispositivos {

    public static void main(String[] args) {
        Celular objC = new Celular("Samsung", "Galaxy S24 Ultra", 512);
        objC.exibirDados();
        
        System.out.println("");
        
        Notebook objN = new Notebook("Lenovo", "IdeaPad Slim 3", 7);
        objN.exibirDados();

    }
    
}
