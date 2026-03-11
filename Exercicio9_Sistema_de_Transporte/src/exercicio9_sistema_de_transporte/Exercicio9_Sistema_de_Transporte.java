package exercicio9_sistema_de_transporte;

public class Exercicio9_Sistema_de_Transporte {

    public static void main(String[] args) {
        Aviao objA = new Aviao("Avião de Grande Porte, 525 pessoas", 970 , "Airbus A380");
        objA.exibirDados();
        
        System.out.println("");
        
        Onibus objO = new Onibus("175T-10", 40, "Ônibus Leito");
        objO.exibirDados();
        

    }
    
}
