import validacoes.InsercaoNegativa;
import validacoes.InsuficienciaSaldo;

import java.text.ParseException;

public class App {

    public static void main(String[] args) throws InsercaoNegativa, InsuficienciaSaldo, ParseException {
    ContaCorrente cc = new ContaCorrente("1212","2010");
    ContaCorrente c1 = new ContaCorrente("1111","2022");
        cc.depositar(100);
        cc.transferir(45,c1);

       // cc.imprimir();
        //c1.imprimir();
        cc.consultarExtrato("08/10/2022","07/10/2022");
        Conta.cancelarConta("conta antiga", cc);

    }
}
