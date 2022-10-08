package validacoes;

public class ContaInexistente extends NullPointerException{


    public ContaInexistente(){
        super();
    }
    @Override
    public String toString() {
        return "Conta não pode ser Nula/Inexistente.";
    }

}
