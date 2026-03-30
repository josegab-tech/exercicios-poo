public class Pedido{

private String nome;
private Cliente cliente;

public Pedido(){

}

public Pedido(String nome, Cliente cliente){
this.nome = nome;
this.cliente = cliente;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;

}


}