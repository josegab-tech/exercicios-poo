import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nomeUsuario, senhaUsuario, lognome, logsenha;

        System.out.println("Cadastre um nome de usuário");
        nomeUsuario = scanner.nextLine();
        System.out.println("Cadastre a senha do usuário");
        senhaUsuario = scanner.nextLine();
        System.out.println("Cadastro concluido");

        do {
            System.out.println("Digite o nome de usuário: ");
            lognome = scanner.nextLine();
            if (nomeUsuario != lognome) {
                System.out.println("Nome de usuário incorreto!");
                break;
            } else if (nomeUsuario == lognome) {
                System.out.println("Senha: ");
                logsenha = scanner.nextLine();
                if (senhaUsuario != logsenha) {
                    System.out.println("Senha incorreta!!");
                    break;
                }
            }else{
                System.out.println("Iniciando sessão");
            }

        } while (nomeUsuario == lognome && senhaUsuario == logsenha);

        scanner.close();
    }
}
