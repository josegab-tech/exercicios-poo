public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            this.saldo += valorDepositado;
            System.out.println("Depósito de " + valorDepositado + " realizado");
        } else {
            System.out.println("Valor inválido, tente um maior do que 0!");
        }

    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Não há nada para ser sacado");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        } else {
            System.out.println("saldo insuficiente!!");
        }
    }

    public double obterSaldo() {
        return this.saldo;
    }

}