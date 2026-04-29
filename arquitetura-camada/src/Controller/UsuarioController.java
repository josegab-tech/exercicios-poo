import Service.UsuarioService;
import View.UsuarioView;
import Model.Usuario;

public class UsuarioController{
    private UsuarioService service;
    private UsuarioView view;

    public UsuarioController(){
        this.service = new UsuarioService();
        this.view = new UsuarioView();
    }

    public void cadastrar(String nome, String email){
        String resultado = service.cadastrar(nome, email);
        view.exibirMensagem(resultado);
    }

    public void listar(){
        List<Usuario> usuarios = service.listarUsuario();
        view.exibiUsuarios(usuarios);
    }
}