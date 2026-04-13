import exceptions.ValorInvalidoException;
import exceptions.VooCanceladoException;
import exceptions.VooLotadoException;

public class App {
    public static void main(String[] args) throws ValorInvalidoException, VooLotadoException, VooCanceladoException {
        Voo voo1 = new Voo(1, 0, 1200);

        
        
        
        /*
        try{
            voo1.reservarAssento(2, 500);
        }catch(ValorInvalidoException e){
            System.out.println("Erro:"+ e.getMessage());
        }
             */
        /* 
        try{
            voo1.reservarAssento(1,1200);
        }catch(VooLotadoException e){
            System.out.println("Erro: " + e.getMessage());
        }
            */

        try{
            voo1.cancelarVoo();
        }catch(VooCanceladoException e ){
            System.out.println("Erro: "+e.getMessage());
        }

    }
}
