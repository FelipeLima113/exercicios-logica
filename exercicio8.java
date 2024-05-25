import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner valordigitado = new Scanner(System.in);
        double volume = 3.14159;
        System.out.println("Digite o Valor do Raio de Uma Lata de Óleo");
        double raio = valordigitado.nextDouble();
        System.out.println("Digite a Altura da Lata de Óleo");
        double altura = valordigitado.nextDouble();
        System.out.println("O Resultado é:"+volume*raio*altura);
    }
}