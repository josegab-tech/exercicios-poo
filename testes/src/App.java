import models.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Calculadora calc = new Calculadora();
    
        int teste = calc.somar(3,5);
    System.out.println(teste);
    }
}
