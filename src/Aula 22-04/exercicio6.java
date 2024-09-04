import java.util.Scanner;
public class exercicio6 {
        public static void main(String[] args) {
            double cotacao = 5.10;
            Scanner valordigitado = new Scanner(System.in);
            System.out.println("Digite um valor em dolar");
            double dolar = valordigitado.nextDouble();
            double v_convertido = dolar*cotacao;
            System.out.println("O valor em reais é: "+v_convertido);

        }
    }
