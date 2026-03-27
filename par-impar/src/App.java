import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    
    int numero;

    System.out.println("Insira um valor inteiro: ");
    numero = scanner.nextInt();

    if(numero % 2 == 0){
        System.out.println("O número é par!!");
    }else{
        System.out.println("O número é ímpar!!");
    }
    

    }
}
