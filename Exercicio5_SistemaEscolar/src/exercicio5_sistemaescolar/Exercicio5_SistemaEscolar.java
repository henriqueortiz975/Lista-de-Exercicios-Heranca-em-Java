package exercicio5_sistemaescolar;

public class Exercicio5_SistemaEscolar {

    public static void main(String[] args) {
        Professor objp = new Professor("Olivio", "543.374.134-43", "Geografia");
        objp.exibirDados();
        
        System.out.println("");
        
        Aluno obja = new Aluno("Miguel da Silva", "353.354.453-31", 357857655);
        obja.exibirDados();
        

    }
    
}
