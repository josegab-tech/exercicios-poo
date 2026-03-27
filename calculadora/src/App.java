import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double n1,n2,resultado;

        char operador;
    
    System.out.println("Digite dois números do tipo double: ");
    n1 = scanner.nextDouble();
    n2 = scanner.nextDouble();

    System.out.println("Escolha um dos operadores abaixo:\n+ para somar\n- para subtrair\n* para multiplicar\n/para dividir");
    operador = scanner.next().charAt(0);
    
    if(operador == '+'){
        resultado = n1 + n2;
    }else if(operador == '-'){
        resultado = n1 - n2;
    }else if(operador == '*'){
        resultado = n1 * n2;
    }else if (operador == '/'){
        resultado = n1 / n2;
    }else
    {
        System.out.println("Valor inválido");
        resultado = 0;
    }
    System.out.println("Resultado:" + resultado);
    scanner.close();
}
}
