import java.util.ArrayList;

public class Time {
    
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(){

    }

    public Time(String nome){
        this.nome = nome;
        
    }

    public Time (String nome, ArrayList<Jogador> jogadores){
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void contratar(Jogador jogador){
        jogadores.add(jogador);
    }

    public void demitir(Jogador jogador){
        jogadores.remove(jogador);
    }

}
