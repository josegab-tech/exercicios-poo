public class Queijo extends IngredienteDecorator {

    public Queijo(Sanduiche s) {
        super(s);
    }

    public String descricao() {
        return sanduiche.descricao() + ", Queijo";
    }

    public double preco() {
        return sanduiche.preco() + 2.0;
    }
}