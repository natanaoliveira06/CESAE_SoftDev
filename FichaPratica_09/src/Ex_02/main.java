package Ex_02;

public class main {


    public static void main(String[] args) {

        //b
        // Instanciar três cãezinhos
        Cao floc = new Cao ("Floc", "salsicha");
        Cao caramelo = new Cao("Caramelo.","pug");
        Cao luna = new Cao ("Luna", "Yorkshire");

        //a
        //Apresentar o latido
        floc.ladrar();

        //c
        caramelo.setLatido("Woff woff");
        caramelo.ladrar();





    }

}
