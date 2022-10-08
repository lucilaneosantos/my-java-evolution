import java.text.DecimalFormat;
import java.util.List;

public class Extrato {
  private String nomeCliente;
  private String agencia;
  private String conta;

   private StringBuilder registrando;
  public Extrato(String conta, String agencia){
      this.conta = conta;
      this.agencia = agencia;
      this.registrando = new StringBuilder();
  }
//  public StringBuilder dadosConta(){
//      StringBuilder resultado = new StringBuilder();
//      resultado.append("Minha Agencia é "+ this.agencia);
//      resultado.append(" ");
//      resultado.append("Conta de Numero "+ this.conta);
//      return resultado;
//  }
    public StringBuilder meuSaldo(double saldo){
        StringBuilder saldoatual = new StringBuilder(" Meu Saldo "+saldo);
        return saldoatual;
    }

    public void movimentacao(String registro, double valor){
        String padrao = "R$###.##0,00";
        DecimalFormat df = new DecimalFormat();
        df.applyLocalizedPattern(padrao);
        registrando.append(registro).append(" ").append(df.format(valor)).append("\n");
    }
    public String historico(){

        return registrando.toString();

        }

    }


