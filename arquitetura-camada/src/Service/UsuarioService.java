package Service;

import Repository.UsuarioRepository;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService{
    private UsuarioRepository repository;

public UsuarioService(){
    this.repository = new UsuarioRepository();
}

public String cadastrar(String nome, String email){
    if(repository.existePorEmail(email)){
        return "Erro: e-mail já cadastrado";
    }
    Usuario novo = new Usuario(nome, email);
    repository.salvar(novo);
    return "Usuário cadastrado com sucesso";
}

public List<Usuario> listarUsuario(){
    return repository.listar();
}
}