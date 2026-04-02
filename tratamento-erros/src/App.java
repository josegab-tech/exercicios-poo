public class App {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 0;



        try{
            int resultado = a/b;
            System.out.println("Resultado: "+resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida");
            System.out.println("JVM: " + e.getMessage());
        }finally{
            System.out.println("Bloco executa automaticamente");
        }
        System.out.println("Rodandoo...");
    }
}
