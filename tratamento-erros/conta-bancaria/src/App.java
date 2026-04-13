import exceptions.ContaInativaException;
import exceptions.SaldoInsuficienteException;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria(1,"José");
        conta1.depositar(100);
        try{
            conta1.sacar(300);
        }catch(SaldoInsuficienteException e){
            System.out.println("Erro: "+ e.getMessage());
        }catch(ContaInativaException e){
            System.out.println(("Erro: " + e.getMessage()));
        }

    
        
    }
}
