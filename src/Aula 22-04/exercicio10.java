import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner valordigitado = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número Inteiro");
        int primeiro = valordigitado.nextInt();
        System.out.println("Digite o Segundo Número Inteiro");
        int segundo = valordigitado.nextInt();
        if (primeiro>segundo) {
            System.out.println("O primeiro número é maior que o segundo");

        } else if (primeiro==segundo) {
            System.out.println("O primeiro número é igual o segundo");
        }

        else {
            System.out.println("O primeiro número é menor que o segundo");
        }
    }


}
