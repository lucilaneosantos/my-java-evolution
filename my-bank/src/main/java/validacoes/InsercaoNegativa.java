package validacoes;

public class InsercaoNegativa extends  Exception{
    public InsercaoNegativa(){
        super();
    }

    @Override
    public String toString() {
        return "O valor de depósito deve ser superior a zero.";
    }
}
