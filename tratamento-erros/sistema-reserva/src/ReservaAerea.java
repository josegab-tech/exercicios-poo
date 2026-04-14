import exception.CpfInvalidoException;
import exception.IdadeMaximaException;
import exception.IdadeMinimaException;
import exception.LimiteReservasException;
import exception.SaldoInsuficienteException;
import exception.SemAssentoException;
import exception.SemVistoException;
import exception.ValorInvalidoException;

public class ReservaAerea {

    private String numeroVoo;
    private String cpfPassageiro;
    private int idadePassageiro;
    private double valorPassagem;
    private int assentosDisponiveis;
    private boolean vooInternacional;
    private boolean passageiroPossuiVisto;
    private double saldoCliente;

    public ReservaAerea(String numeroVoo, String cpfPassageiro, int idadePassageiro, double valorPassagem,
            int assentosDisponiveis, boolean vooInternacional, boolean passageiroPossuiVisto, double saldoCliente) {
        this.numeroVoo = numeroVoo;
        this.cpfPassageiro = cpfPassageiro;
        this.idadePassageiro = idadePassageiro;
        this.valorPassagem = valorPassagem;
        this.assentosDisponiveis = assentosDisponiveis;
        this.vooInternacional = vooInternacional;
        this.passageiroPossuiVisto = passageiroPossuiVisto;
        this.saldoCliente = saldoCliente;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getCpfPassageiro() {
        return cpfPassageiro;
    }

    public void setCpfPassageiro(String cpfPassageiro) {
        this.cpfPassageiro = cpfPassageiro;
    }

    public int getIdadePassageiro() {
        return idadePassageiro;
    }

    public void setIdadePassageiro(int idadePassageiro) {
        this.idadePassageiro = idadePassageiro;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public boolean isVooInternacional() {
        return vooInternacional;
    }

    public void setVooInternacional(boolean vooInternacional) {
        this.vooInternacional = vooInternacional;
    }

    public boolean isPassageiroPossuiVisto() {
        return passageiroPossuiVisto;
    }

    public void setPassageiroPossuiVisto(boolean passageiroPossuiVisto) {
        this.passageiroPossuiVisto = passageiroPossuiVisto;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public void reservar(int quantidade) throws CpfInvalidoException, IdadeMaximaException, IdadeMinimaException, LimiteReservasException, SaldoInsuficienteException, SemAssentoException, SemVistoException, ValorInvalidoException {

        if(this.idadePassageiro < 18){
            throw new IdadeMinimaException(
                "A idade mínima é de 18 anos."
            );
        }
        if(this.idadePassageiro > 100){
            throw new IdadeMaximaException(
                "Limite de idade alcançado."
            );
        }
        if(this.assentosDisponiveis == 0){
            throw new SemAssentoException(
                "O voo ja está lotado."
            );
        }
        if(this.valorPassagem > this.saldoCliente){
            throw new SaldoInsuficienteException(
                "Saldo insuficiente."
            );
        }
        if(this.vooInternacional == true && this.passageiroPossuiVisto == false){
            throw new SemVistoException(
                "O passageiro não possui um visto."
            );
        }
        if(this.cpfPassageiro.length() < 11 || !this.cpfPassageiro.matches("\\d+")){
            throw new CpfInvalidoException(
                "CPF inválido."
            );
        }
        if(this.valorPassagem <= 0){
            throw new ValorInvalidoException(
                "O valor da passagem deve ser maior do que 0"
            );
        }
        if(quantidade > 3){
            throw new LimiteReservasException(
                "Limite de reservas alcançado, só é possivel 3 por CPF"
            );
        }

        this.assentosDisponiveis--;
        quantidade ++;

    }
}