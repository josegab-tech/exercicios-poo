// Apenas dados, sem lógica


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