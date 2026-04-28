public class RetanguloAdapter implements AreaCalculavel {

    private CalculadoraDeAreaRetangulo calc;
    private double largura;
    private double altura;

    public RetanguloAdapter(double l, double a) {
        calc = new CalculadoraDeAreaRetangulo();
        largura = l;
        altura = a;
    }

    public double calcularArea() {
        return calc.calcular(largura, altura);
    }
}