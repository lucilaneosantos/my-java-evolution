import validacoes.InsercaoNegativa;
import validacoes.InsuficienciaSaldo;

public class App {

    public static void main(String[] args) throws InsercaoNegativa, InsuficienciaSaldo {
    ContaCorrente cc = new ContaCorrente("1111","2222");
    ContaCorrente c1 = new ContaCorrente("1111","222222");
        cc.depositar(100);
        System.out.println(cc.getSaldo());
        cc.transferir(45,c1);
        System.out.println(cc.getSaldo());
        System.out.println(c1.getSaldo());

        System.out.println(c1.imprimir());
    }
}
