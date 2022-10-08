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

    private Extrato mostrar;

    public Conta(String conta, String agencia){
        this.conta = conta;
        this.agencia = agencia;
        this.mostrar = new Extrato(this.getConta(),getAgencia());
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
        mostrar.movimentacao("Deposito realizado na Conta "+this.conta,this.saldo);
    }
    public void sacar(double valor) throws InsuficienciaSaldo {
        this.saldo-=valor;
        mostrar.movimentacao("Saque realizado na Conta "+this.conta,valor);
    }
    public void transferir(double valor,Conta conta) throws InsuficienciaSaldo, InsercaoNegativa {
        this.sacar(valor);
        conta.depositar(valor);
        mostrar.movimentacao("Transferencia para Conta "+conta.conta,valor);
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
    public  void imprimir(){
        System.out.println(mostrar.historico());
    }

}
