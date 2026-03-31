import java.time.LocalDate;

public class Emprestimo{


    private Livro livro;
    private Leitor leitor;
    private localDate dataEmprestimo;
    private localDate dataEvolucao;

    public void setLivro(Livro livro){
        this.livro= livro;
    }

    public void setLeitor(Leitor leitor){
        this.leitor = leitor;
    }

    public Livro getLivro(){
        return this.livro;
    }

    public Leitor getLeitor(){
        return this.leitor;
    }

    public LocalDate dataEmprestimo(){
        return this.dataEmprestimo();
    }

    public LocalDate dataDevolucao(){
        return this.dataDevolucao();
    }

    public Emprestimo(Livro livro, Leitor leitor){
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(7);
    }
}