package Ex_02;

import java.util.ArrayList;

public class Fatura {

    private ArrayList<Taco> fatura;

    public Fatura() {
        this.fatura = new ArrayList<>();
    }

    public void adicionarTaco(Taco tacoNovo) {
        this.fatura.add(tacoNovo);
    }

    public void imprimirFatura() {
        for (Taco tacoAtual : this.fatura) {
            tacoAtual.mostrar();
        }
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for (Taco tacoAtual : this.fatura) {
            valorTotal += tacoAtual.getPreco();
        }
        return valorTotal;
    }
}
