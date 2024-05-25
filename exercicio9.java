import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner valordigitado = new Scanner(System.in);
        System.out.println("Digite a idade");
        int idade = valordigitado.nextInt();
        int meses = idade*12;
        int dias = idade*365;
        System.out.println("A idade dessa pessoa em anos é: "+idade);
        System.out.println("A idade dessa pessoa em meses é: "+meses);
        System.out.println("A idade dessa pessoa em dias é: "+ dias);

    }
}
