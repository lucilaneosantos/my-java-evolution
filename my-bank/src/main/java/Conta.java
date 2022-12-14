import validacoes.ContaInexistente;
import validacoes.InsercaoNegativa;
import validacoes.InsuficienciaSaldo;

import java.time.LocalDate;

public class Conta {

    private String conta;
    private String agencia;
    private String nomeCliente;
    private LocalDate dataDeNascimento;
    private Double saldo=0.0;

    public Conta(String conta, String agencia){
        this.conta = conta;
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) throws InsercaoNegativa {
        this.saldo+=valor;
    }
    public void sacar(double valor) throws InsuficienciaSaldo {
        this.saldo-=valor;
    }
    public void transferir(double valor,Conta conta) throws InsuficienciaSaldo, InsercaoNegativa {
        this.sacar(valor);
        conta.depositar(valor);
    }
    public static boolean cancelarConta(String justificativa,Conta cancelarConta) throws ContaInexistente{
        boolean cancelada;

        if( justificativa!="" ){
            cancelarConta=null;
            cancelada=true;
        }else{
            cancelada =false;
        }
        return cancelada;

    }
}
