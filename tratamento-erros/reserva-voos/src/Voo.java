import exceptions.VooCanceladoException;
import exceptions.VooLotadoException;
import exceptions.ValorInvalidoException;

public class Voo {
    
    private int numeroVoo;
    private int assententosDisponiveis;
    private double valorPassagem;


    public Voo(int numeroVoo, int asstentosDisponiveis, double valorPassagem){
        this.numeroVoo = numeroVoo;
        this.assententosDisponiveis = asstentosDisponiveis;
        this.valorPassagem = valorPassagem;
    }


    public void setNumeroVoo(int numeroVoo){
        this.numeroVoo = numeroVoo;
    }

    public void setAssentosDisponiveis(int asstentosDisponiveis){
        this.assententosDisponiveis = asstentosDisponiveis;
    }

    public void setValorPassagem(double valorPassagem){
        this.valorPassagem = valorPassagem;
    }

    public int getNumeroVoo(){
        return this.numeroVoo;
    }

    public int getAssentosDisponiveis(){
        return this.assententosDisponiveis;
    }

    public double getValorPassagem(){
        return this.valorPassagem;
    }

    public void reservarAssento(int quantidade, double valorPago) throws ValorInvalidoException, VooLotadoException{
        if(quantidade <=0 || valorPago < (quantidade * valorPassagem)){
            throw new ValorInvalidoException(
                "Valor inválido!!"
            );
        }
        if(quantidade > assententosDisponiveis){
            throw new VooLotadoException("O voo está lotado!!");
        }
        assententosDisponiveis -= quantidade;
    }

    public void cancelarVoo() throws VooCanceladoException{
        throw new VooCanceladoException("Infelizmente o voo foi cancelado");
    }
}
