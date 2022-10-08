import validacoes.ContaInexistente;
import validacoes.InsercaoNegativa;
import validacoes.InsuficienciaSaldo;

public class ContaCorrente extends Conta {

    public ContaCorrente(String conta, String agencia) {
        super(conta, agencia);
    }
@Override
    public void depositar(double valor) throws InsercaoNegativa {
        if(valor<=0) {
            throw new InsercaoNegativa();
        }else{
           super.depositar(valor);
        }
    }
@Override
    public void sacar(double valor) throws InsuficienciaSaldo {

        if(valor>getSaldo()) {
            throw new InsuficienciaSaldo();
        }else{
            super.sacar(valor);
        }
    }
    @Override
    public void transferir(double valor,Conta conta) throws InsuficienciaSaldo, InsercaoNegativa {

        if(conta!=null){
            super.transferir(valor,conta);
        }else{
            throw new ContaInexistente();
        }

    }


}
