package exercicio4_veiculos;

public class Exercicio4_Veiculos {

    public static void main(String[] args) {
        Veiculo objveiculo = new Veiculo("Hyundai", "HB20", 2012);
        objveiculo.exibirDados();
        System.out.println("");
        
        Carro objcarro = new Carro("Toyota", "Corolla Cross", 2025, 4);
        objcarro.exibirDados();
        System.out.println("");
        
        Moto objmoto = new Moto("Yamaha", "Street", 2026, "125cc");
        objmoto.exibirDados();

    }
    
}
