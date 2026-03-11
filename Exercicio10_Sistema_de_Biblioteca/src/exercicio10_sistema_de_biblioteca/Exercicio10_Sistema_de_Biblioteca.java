package exercicio10_sistema_de_biblioteca;

public class Exercicio10_Sistema_de_Biblioteca {

    public static void main(String[] args) {
        Livro objL = new Livro("Dom Casmurro", 1900, "Machado de Assis");
        objL.exibirDados();
        
        System.out.println("");
        
        Revista objR = new Revista("Revista de Engenharia", 32, "SILVA, A. B. Estudos Técnicos");
        objR.exibirDados();

    } 
}
