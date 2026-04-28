import java.util.ArrayList;
import java.util.List;

public class EstacaoClimatica {
    private List<Display> displays = new ArrayList<>();

    private float temperatura;
    private float umidade;
    private float pressao;

    public void registrar(Display d) {
        displays.add(d);
    }

    public void notificar() {
        for (Display d : displays) {
            d.Atualizar(temperatura, umidade, pressao);
        }
    }

    public void setMedidas(float t, float u, float p) {
        temperatura = t;
        umidade = u;
        pressao = p;
        notificar();
    }
}