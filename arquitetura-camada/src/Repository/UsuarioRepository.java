// Persistêcia - só salva e busca
package Repository;

import Model.Usuario;
import java.util.List;
import java.util.ArrayList;

public class UsuarioRepository{
    private static List<Usuario> banco = new ArrayList<>();


public void salvar(Usuario usuario){
    banco.add(usuario);
}

public boolean existePorEmail(String email){
    for(Usuario u : banco){
        if(u.getEmail().equals(email)){
            return true;
        }
    }
    return false;
}

public List<Usuario> listar(){
    return new ArrayList<>(banco);
}
}