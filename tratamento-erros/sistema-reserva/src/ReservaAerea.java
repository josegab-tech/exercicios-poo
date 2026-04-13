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

    public void reservar(){
        if(idadePassageiro < 18){
            System.out.println("Erro_IDADE_MINIMA");
        }
        if(idadePassageiro>100){
            System.out.println("ERRO_IDADE_MAXIMA");
        }
        if(assentosDisponiveis == 0){
            System.out.println("ERRO_SEM_ASSCENTO");
        }
        if(saldoCliente < valorPassagem){
            System.out.println("ERRO_SALDO_INSUFICIENTE");
        }
        if(vooInternacional == true && passageiroPossuiVisto == false){
            System.out.println("ERRO_SEM_VISTO");
        }
        if(cpfPassageiro.length() < 10 ){
            System.out.println("ERRO_CPF_INVALIDO");
        }
        if(valorPassagem <=0){
            System.out.println("VALOR INVALIDO");
        }
    }
}