package Ex_03;

public class Animal {

    // Atributos do animal
    private String nome;
    private String especie;
    private String paisOrigem;
    double pesoAnimal; // PESO EM Kg
    private String[] alimentacao;

    // Método construtor do animal
    public Animal(String nome, String especie, String paisOrigem, double pesoAnimal, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoAnimal = pesoAnimal;
        this.alimentacao = alimentacao;
    }

    //Método para o animal comer
    public void comer(String alimento, double pesoAlimento) { //PESO EM gramas

        for (int i = 0; i < this.alimentacao.length; i++) {
            if (this.alimentacao[i].equals(alimento)) {
                this.pesoAnimal += (pesoAlimento/1000);
                System.out.println("O animal comeu " + alimento);
                System.out.println("Peso do animal: " + pesoAnimal);
                return;
            }
        }
        System.out.println("O animal recusou a comida " + alimento);
    }


}


