package exercicio7_contabancaria;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;
    
    public ContaPoupanca(int numeroconta, double saldo, double taxaRendimento) {
        super(numeroconta, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }
    
    public double getTaxaRendimento(){
        return taxaRendimento;
    }
    
    public void exibirDados(){
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Taxa de rendimento: " + getTaxaRendimento() + "%");
    }    
    
}
