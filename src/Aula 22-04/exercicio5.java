import java.util.Scanner;
public class exercicio5 {
        public static void main(String[] args) {

            double cotacao = 5.10;
            Scanner valordigitado = new Scanner(System.in);
            System.out.println("Digite um Valor em Dolar");
            double dolar = valordigitado.nextDouble();
            double v_convertido = dolar*cotacao;
            System.out.println("O valor da conversão é: "+v_convertido);

        }
    }

