package exercicio10_sistema_de_biblioteca;

public class Livro extends ItemBiblioteca{
    private String autor;
    
    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void exibirDados(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano da publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + getAutor());
    }
    
}
