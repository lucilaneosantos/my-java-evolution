import validacoes.InsercaoNegativa;
import validacoes.InsuficienciaSaldo;

public class App {

    public static void main(String[] args) throws InsercaoNegativa, InsuficienciaSaldo {
    ContaCorrente cc = new ContaCorrente("1212","2010");
    ContaCorrente c1 = new ContaCorrente("1111","2022");
        cc.depositar(50);
        cc.imprimir();
        cc.transferir(45,c1);
        c1.imprimir();
        cc.imprimir();
    }
}
