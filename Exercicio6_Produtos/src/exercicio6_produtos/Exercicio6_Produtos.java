 package exercicio6_produtos;

public class Exercicio6_Produtos {

    public static void main(String[] args) {
        ProdutoEletronico  objPE = new ProdutoEletronico("Notebook", 2635.30, 19);
        objPE.exibirDados();
        
        System.out.println("");
        
        ProdutoAlimenticio objPA = new ProdutoAlimenticio("Miojo", 5.75, "20/11/2026");
        objPA.exibirDados();

    }
    
}
