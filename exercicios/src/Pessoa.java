public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 100) {
            System.out.println("idade maior do que 100");
            this.idade = 0;
        } else if (idade < 0) {
            System.out.println("Idade negativa... Não permitido");
            this.idade = 0;
        } else
            this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public Pessoa(String nome, int idade) {

    }

}