package Ex_02;

public class Conta {

    //Declarar atributos

    private int numConta;
    private double saldo;
    private String titularConta;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0.9;
    private double valorDivida;

    //Método construtor
    public Conta(int numConta, double saldo, String titularConta) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    //Método pedir Emprestimo
/*
    public void pedirEmprestimo(int valorEmprestimo) {

        //se o valor da dívida for maior que 0 não há emprestimo
        if (valorDivida > 0) {
            System.out.println("Emprestimo não permitido! Valores em dívida a serem acertados.");
        } else {
            //se o valor do emprestimo for maenor ou igual a margem de emprestimo
            if (valorEmprestimo <= (saldo * margemEmprestimo)) {
                saldo += valorEmprestimo; //saldo soma o valor do emprestimo
                valorDivida += valorEmprestimo; //Atualiza o saldo em divida
                System.out.println("Saldo após emprestimo: " + saldo);
                System.out.println("Valor da dívida: " + valorDivida);
            } else {
                System.out.println("Valor do emprestimo não permitido! Acima da margem de emprestimo.");
            }
        }
    }*/

    public boolean pedirEmprestimo(int valorEmprestimo) {
        if (valorDivida > 0) {
            System.out.println("Emprestimo não permitido! Valores em dívida a serem acertados.");
            return false;
           
        } else {
            //se o valor do emprestimo for maenor ou igual a margem de emprestimo
            if (valorEmprestimo <= (saldo * margemEmprestimo)) {
                saldo += valorEmprestimo; //saldo soma o valor do emprestimo
                valorDivida += valorEmprestimo; //Atualiza o saldo em divida
                System.out.println("Saldo após emprestimo: " + saldo);
                System.out.println("Valor da dívida: " + valorDivida);
                return true;
            } else {
                System.out.println("Valor do emprestimo não permitido! Acima da margem de emprestimo.");
                return false;
            }
        }
    }
}
