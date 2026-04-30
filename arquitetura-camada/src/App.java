
import Controller.UsuarioController;

public class App {
    public static void main(String[] args) {
        
        UsuarioController controller = new UsuarioController();
        controller.cadastrar("João", "joao@email.com");
        controller.cadastrar("Zeca", "zeca@email.com");
        controller.cadastrar("Armando", "armando@email.com");
        controller.cadastrar("Antônio", "antonio@email.com");
        controller.cadastrar("Natanael", "natanael@email.com");
        controller.listar();
    }
}
