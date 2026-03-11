package exercicio7_contabancaria;

public class Exercicio7_ContaBancaria {

    public static void main(String[] args) {
        ContaCorrente objCC = new ContaCorrente(3483653, 3420.50, 1000);
        objCC.exibirDados();
        
        System.out.println("");
        
        ContaPoupanca objCP = new ContaPoupanca(4239857, 3000, 12);
        objCP.exibirDados();

    }
    
}
