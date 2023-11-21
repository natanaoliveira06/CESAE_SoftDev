package Ex_03;

public class Animal {

    // Atributos do animal
    private String nome;
    private String especie;
    private String paisOrigem;
    double pesoAnimal; // PESO EM Kg
    private Alimento[] alimetacao;

    // Método construtor do animal
    public Animal(String nome, String especie, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.pesoAnimal = peso;
    }

    // Dec
    public Animal() {
        this.alimetacao = new Alimento[5];

    }

    //Método para o animal comer
    public void comer(String alimento, double pesoAlimento) { //PESO EM gramas
        pesoAnimal += pesoAlimento;
        System.out.println("O animal comeu " + alimento);


    }
}
