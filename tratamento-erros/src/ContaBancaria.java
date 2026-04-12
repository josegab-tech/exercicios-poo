import exceptions.SaldoInsuficienteException;
import exceptions.ValorInvalidoException;
import exceptions.ContaInativaException;
public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.ativa = true;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getAtiva() {
        return this.ativa;
    }

    public void sacar(double valor) throws SaldoInsuficienteException, ContaInativaException{
    
        if (valor > saldo || valor <= 0){
        throw new SaldoInsuficienteException(
            "Saldo atual: R$" + saldo + "| Saque: R$ "+ valor
        );
    }
    if(ativa == false){
            throw new ContaInativaException("Sua conta está inativa");
        }
        saldo -=valor;
    }

    public void depositar(double valor) throws ValorInvalidoException{

        if(valor <=0){
            throw new ValorInvalidoException("O valor deve ser maior do que 0!");
        }
        saldo += valor;

    }

}
