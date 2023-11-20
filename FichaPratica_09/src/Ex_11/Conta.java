package Ex_11;

public class Conta {

    //Declarar atributos

    private int numConta;
    private double saldo;
    private String titularConta;


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

    //Método transferencia
    public void transferencia(double valorTransferir, Conta contaDestinatario) {

        if(saldo>valorTransferir){
            this.saldo-=valorTransferir;
            contaDestinatario.depositar(valorTransferir);
            System.out.println("Valor a transferir: " + valorTransferir);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }


    //Método depositar

    public void depositar(double valorDepositar) {
        double saldoAtualizado;
        saldoAtualizado = saldo + valorDepositar;
        System.out.println("Valor depósito: " + valorDepositar +"\nSaldo atual: " + saldoAtualizado);
    }

    //Método levantar
    public void levantar(double valorLevantar) {
        double saldoAtualizado = 0;
        if (saldo > 0) {
            saldoAtualizado = saldo - valorLevantar;
            System.out.println("Valor a levantar: " + valorLevantar +"\nSaldo atual: " + saldoAtualizado);
        } else {
            System.out.println("SALDO INSUFICIENTE!\nNão é possível realizar a operação.");
        }

    }


}


