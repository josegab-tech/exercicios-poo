import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

// Classe que armazena a coleção
class ColecaoNomes implements Iterable<String> {
    private List<String> nomes = new ArrayList<>();

    public void adicionar(String nome) {
        nomes.add(nome);
    }

    @Override
    public Iterator<String> iterator() {
        return nomes.iterator(); // usa iterator interno do Java
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        ColecaoNomes colecao = new ColecaoNomes();

        colecao.adicionar("João");
        colecao.adicionar("Maria");
        colecao.adicionar("Pedro");

        Iterator<String> it = colecao.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}