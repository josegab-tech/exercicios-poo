public class Tomate extends IngredienteDecorator {

    public Tomate(Sanduiche s) {
        super(s);
    }

    public String descricao() {
        return sanduiche.descricao() + ", Tomate";
    }

    public double preco() {
        return sanduiche.preco() + 1.5;
    }
}