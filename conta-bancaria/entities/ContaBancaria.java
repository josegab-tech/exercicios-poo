import exceptions.ContaInativaException;
import exceptions.SaldoInsuficienteException;

public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
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

    public void sacar(double valor) throws ContaInativaException, SaldoInsuficienteException{
        if(valor <=0){
            throw new ValorInvalidoException("Valor não permitido");
        }
        if(!this.ativa){
            throw new ContaInativaException("Conta inativa");
        }
        if(valor > this.saldo){
            throw new SaldoInsuficienteException("Slado insuficiente");
        }
        this.saldo -= valor;
            
        }

    public void depositar(double valor){
        if(valor <= 0){
            throw new ValorInvalidoException("Valor inválido");
        }
        saldo += valor;
    }
    }

