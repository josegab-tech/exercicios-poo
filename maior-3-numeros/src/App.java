import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double n1,n2,n3,maior;

        System.out.println("Digite 3 número do tipo double: ");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();
        
        System.out.println(n1);

        if(n1> n2 && n1 > n3){
            maior = n1;
        }else if(n2 > n1 && n2 > n3){
            maior = n2;
        }else{
            maior = n3;
        }


        System.out.println("O maior número dos 3 é: "+maior);
    }
}
