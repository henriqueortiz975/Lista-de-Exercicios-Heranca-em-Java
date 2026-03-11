package exercicio10_sistema_de_biblioteca;

public class Revista extends ItemBiblioteca{
    private String edicao;
    
    public Revista(String titulo, int anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }
    
    public void setEdicao(String edicao){
        this.edicao = edicao;
    }
    
    public String getEdicao(){
        return edicao;
    }
    
    public void exibirDados(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano da publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + getEdicao());
    }
    
}
