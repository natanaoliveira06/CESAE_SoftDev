package FichaPratica03;

public class Ex_12 {
    public static void main(String[] args) {


        int inicio=8, fim=17, mult;

        mult = inicio * 5;


        while (inicio<=fim) {

            if (inicio % 5 == 0) {
                System.out.println(inicio);
            } else {
                System.out.println("Não é multiplo de 5");

            }
        }



        }
}
