package validacoes;

public class InsuficienciaSaldo extends Exception{
   public InsuficienciaSaldo(){
       super();
   }
    @Override
    public String toString() {
        return "Saldo insuficiente para esta transação.";
    }
}
