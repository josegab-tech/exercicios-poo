public class Animal {
    
    protected String nome;
    
    public void emitirSom(){
        System.out.println("Som genérico");
    }

    public Animal(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
}


