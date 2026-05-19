public class App {
    public static void main(String[] args) throws Exception {
        int soma = Calculadora.somar(120, 1000);
        System.out.println("Soma: "+soma);
        int multiplicacao = Calculadora.multiplicar(10, soma);
        System.out.println("Multiplicacao: "+ multiplicacao);
    }
}
