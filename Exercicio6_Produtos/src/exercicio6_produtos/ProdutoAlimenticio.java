package exercicio6_produtos;

public class ProdutoAlimenticio extends Produto{
    private String dataValidade;
    
    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
    
    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public String getDataValidade(){
        return dataValidade;
    }
    
    public void exibirDados(){
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Data de validade: " + getDataValidade());
    }    
    
}
