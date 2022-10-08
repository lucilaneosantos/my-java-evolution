public class Extrato {
  private String nomeCliente;
  private String agencia;
  private String conta;
  public Extrato(String conta, String agencia){
      this.conta = conta;
      this.agencia = agencia;
  }
  public StringBuilder dadosConta(){
      StringBuilder resultado = new StringBuilder();
      resultado.append("Minha Agencia é "+ this.agencia);
      resultado.append(" ");
      resultado.append("Conta de Numero "+ this.conta);
      return resultado;
  }
    public StringBuilder meuSaldo(double saldo){
        StringBuilder saldoatual = new StringBuilder(" Meu Saldo "+saldo);
        return saldoatual;
    }

}
