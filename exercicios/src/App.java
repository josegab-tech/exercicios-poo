import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.setNome("Cobertor");
        p1.setNome("Camiseta"); // teste de troca de valores
        p1.setPreco(45);
        p2.setNome("Ar-condicionado");
        p2.setPreco(300);

        System.out.println(p1.getNome() + " " + p1.getPreco());
        System.out.println(p2.getNome() + " " + p2.getPreco());

        System.out.println("\n Exercicio 2\n ");

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Joaquinn");
        a1.setNota(3);
        a2.setNome("Ana");
        a2.setNota(8);
        a3.setNome("Roberto");
        a3.setNota(6);

        System.out.println(a1.getNome() + " " + a1.getNota());
        System.out.println(a2.getNome() + " " + a2.getNota());
        System.out.println(a3.getNome() + " " + a3.getNota());

        System.out.println("\nex10\n");

        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro("dogmaul");
        animais[1] = new Gato("Mauricio");

        for (int i = 0; i <= 1; i++) {
            System.out.println("Animal: " + animais[i].getNome());
            animais[i].emitirSom();
        }

        System.out.println("\nexercício 12\n");

        int opcao;
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        do{
            System.out.println("Somar dois inteiros;");
            System.out.println("Somar três inteiros;");
            System.out.println("Multiplicar dois números;");
            System.out.println("Dividir dois números");

            switch(opcao){

                case 1:
                System.out.println("Digite os dois números");
                int a = scanner.nextInt();

            }



            opcao = scanner.nextInt();
            while(opcao != 0);

            scanner. close();
        }

    }
}
