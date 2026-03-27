import java.util.Scanner;

public class App {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        /* 
        int a, b, soma, sub, mult, div;

        System.out.println("Insira o primeiro número inteiro");
        a = scanner.nextInt();

        System.out.println("Insira o segundo valor inteiro");
        b = scanner.nextInt();

        soma = a + b;
        mult = a * b;
        div = a / b;
        sub = a - b;

        System.out.println("A soma foi: " + soma);
        System.out.println("A multiplicação foi:  " + mult);
        System.out.println("A subtração foi: " + sub);
        System.out.println("A divisão foi: " + div);

        int divPor3;

        divPor3 = a / 3;

        System.out.println("O resultado do primeiro inteiro por 3 foi: " + divPor3);

        double do1, do2, do3, mediaDouble;

        System.out.println("Digite o primeiro double: ");
        do1 = scanner.nextDouble();
        System.out.println("Digite o segundo double: ");
        do2 = scanner.nextDouble();
        System.out.println("Digite o terceiro double: ");
        do3 = scanner.nextDouble();

        mediaDouble = (do1 + do2 + do3) / 3;

        if (mediaDouble > 7) {
            System.out.println("Aprovado");
        } else if (mediaDouble >= 5 && mediaDouble <= 6.99) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        */
        int primeira, segunda;

        System.out.println("Digite o primeiro inteiro");
        primeira = scanner.nextInt();
        System.out.println("Digite o segundo inteiro");
        segunda = scanner.nextInt();

        if (primeira == segunda) {
            System.out.println("Os dois números são iguais");
        }else if(primeira < segunda){
            System.out.println("O primeiro número é menor do que o segundo");
        }else{
            System.out.println("O primeiro número é maior do que o segundo");
        }

        scanner.close();
    }
}
