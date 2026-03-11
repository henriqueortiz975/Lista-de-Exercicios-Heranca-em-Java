package exercicio10_sistema_de_biblioteca;

public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    
    public ItemBiblioteca(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    
    public void exibirDados(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano da publicação: " + getAnoPublicacao());
    }
    
}
