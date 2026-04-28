public abstract class IngredienteDecorator implements Sanduiche {
    protected Sanduiche sanduiche;

    public IngredienteDecorator(Sanduiche s) {
        sanduiche = s;
    }
}