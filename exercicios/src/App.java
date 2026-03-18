

public class App {
    public static void main(String[] args) throws Exception {
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();

         p1.setNome("Cobertor");
         p1.setPreco(45);
         p2.setNome("Ar-condicionado");
         p2.setPreco(300);

        System.out.println(p1.getNome() + " " + p1.getPreco());
        System.out.println(p2.getNome() + " " + p2.getPreco());


        System.out.println("\n Exercicio 2\n ");


        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Joaquinn");
        a1.setNota(3);
        a2.setNome("Ana");
        a2.setNota(8);
        a3.setNome("Roberto");
        a3.setNota(6);

        System.out.println(a1.getNome() + " " + a1.getNota());
        System.out.println(a2.getNome() + " " + a2.getNota());
        System.out.println(a3.getNome() + " " + a3.getNota());
    }
}
