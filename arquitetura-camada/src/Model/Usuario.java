package Model;

public class Usuario{
    private String nome;
    private String email;
    private String telefone;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.telefone = null;
    }

    public Usuario(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setNome(String nome){
        this.nome =nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }
}