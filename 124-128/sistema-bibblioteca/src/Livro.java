public class Livro {
    
    private String titulo;
    private Autor autor;
    private int ano;


    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getNome(String nome){
        return this.nome;
    }

    public Autor getAutor(Autor autor){
        return this.autor;
    }

    public int getIdade(int idade){
        return this.idade;
    }

    public Livro(String titulo, Autor autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
   
}
