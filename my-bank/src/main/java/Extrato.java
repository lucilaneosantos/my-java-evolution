public class Extrato {
  private String nomeCliente;
  private String agencia;
  private String conta;
  public Extrato(String nomeCliente, String agencia){
      this.nomeCliente = nomeCliente;
      this.agencia = agencia;
  }
  public StringBuilder dadosCliente(){
      StringBuilder resultado = new StringBuilder();
      resultado.append("Nome é "+ this.nomeCliente);
      resultado.append(" ");
      resultado.append("Nome é "+ this.agencia);
      return resultado;
  }

}
