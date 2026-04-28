public class Bacon extends IngredienteDecorator {

    public Bacon(Sanduiche s) {
        super(s);
    }

    public String descricao() {
        return sanduiche.descricao() + ", Bacon";
    }

    public double preco() {
        return sanduiche.preco() + 3.0;
    }
}