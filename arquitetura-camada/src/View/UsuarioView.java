// Apenas dados, sem lógica
package View;

import java.util.List;
import Model.Usuario;
import Controller.UsuarioController;
import java.util.ArrayList;
import Service.UsuarioService;

public class UsuarioView{
    public void exibirMensagem(String msg){
        System.out.println(msg);
    }

    public void exibiUsuarios(List<Usuario> usuarios){
        for(Usuario u : usuarios){
            System.out.println(u.getNome() + " - " + u.getEmail());
        }
    }
}