package fundamentos.powerclasses;

import java.time.LocalDate;

public class TiposDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
        int numero = 12;
        int teste = numero%2;
        System.out.println(teste);
    }
}
