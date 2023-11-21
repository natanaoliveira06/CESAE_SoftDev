package Ex_06;

public class Main {
    public static void main(String[] args) {


        Atleta atleta1= new Atleta("Ana B.", "natação", 1.7, 58,"Canadá");
        Atleta atleta2= new Atleta("Julia B.", "voley", 1.8, 75, "Colômbia");
        Atleta atleta3= new Atleta("Han Jun", "judô", 1.75, 75, "Japão");
        Atleta atleta4= new Atleta("Panja B.", "futebol", 1.67, 65, "Índia");
        Atleta atleta5= new Atleta("Ralph J.", "natação", 1.85, 80, "EUA");
        Atleta atleta6= new Atleta("José A.", "futebol", 1.78, 73, "Brasil");

       // Competicao competicao1=new Competicao("Jogos Abertos", "Portugal", new String[]{"Ana B.", "Julia B."});
       // Competicao competicao2=new Competicao("Jogos de Verão", "Espanha");



        atleta2.exibirDetalhes();
    }
}
