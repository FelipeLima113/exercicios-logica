// Felipe lima 1º 3
//Faça um programa de conversão de base numérica. O programa deverá
//apresentar uma tela de entrada com as seguintes opções:
//1 – Adição
//2 – Subtração
//3 – Multiplicação
//4 – Divisão
//5 - Sair
import java.util.Scanner;

public class AtividadeAvaliativa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Escolha uma das operações abaixo: \n" +
                    "1 - Adição \n" +
                    "2 - Subtração \n" +
                    "3 - Multiplicação \n" +
                    "4 - Divisão \n" +
                    "5 - Sair");
            System.out.println("---------------------------------");

            int op = sc.nextInt();
            System.out.println("---------------------------------");

            if (op == 5) {
                System.out.println("Programa encerado!");
                System.out.println("---------------------------------");
                break;

            }

            if (op > 5) {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.println("---------------------------------");
            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();
            System.out.println("---------------------------------");

            int resultado = 0;

            if (op == 1) {
                resultado = n1 + n2;
            } else if (op == 2) {
                resultado = n1 - n2;
            } else if (op == 3) {
                resultado = n1 * n2;
            } else if (op == 4) {
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    continue;
                }
            }

            System.out.println("O Resultado é: " + resultado);
        }

        sc.close();
    }
}

