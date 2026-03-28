import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nomeUsuario, senhaUsuario, logNome, logSenha;

        System.out.println("Cadastre um nome de usuário");
        nomeUsuario = scanner.nextLine();
        System.out.println("Cadastre a senha do usuário");
        senhaUsuario = scanner.nextLine();
        System.out.println("Cadastro concluido");

        do {
            System.out.println("Digite o nome de usuário: ");
            logNome = scanner.nextLine();
            System.out.println("Senha: ");
            logSenha = scanner.nextLine();

            if(!nomeUsuario.equals(logNome)){
                System.out.println("Nome de usuário incorreto!!");
            }else if(!senhaUsuario.equals(logSenha)){
                System.out.println("Senha incorreta!!");
            }else{
                System.out.println("Iniciando a sessão");
                break;
            }
            

        } while (true);

        scanner.close();
    }
}
