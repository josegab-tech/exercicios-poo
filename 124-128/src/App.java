import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente2 = new Cliente("Will");

        Pedido pedido = new Pedido("\npedido estranho\n", cliente2);

        System.out.println("Pedido:" + pedido.getNome() + cliente2.getNome());

        // time-jogador

        ArrayList<Jogador> JogadoresPalmeiras = new ArrayList<>();

        Time palmeiras = new Time("Palmeiras", JogadoresPalmeiras);

        Jogador jogador1 = new Jogador("Fernando");
        Jogador jogador2 = new Jogador("Souza");

        JogadoresPalmeiras.add(jogador1);
        JogadoresPalmeiras.add(jogador2);

        System.out.println("Nome do time: " + palmeiras.getNome());

        for(int i = 0 ; i< JogadoresPalmeiras.size(); i++){
            System.out.println("- "+JogadoresPalmeiras.get(i).getNome());
        }


        

    }
}
