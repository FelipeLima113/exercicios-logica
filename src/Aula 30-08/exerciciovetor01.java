import java.util.Scanner;

public class exerciciovetor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicoes[] = new int[50];
        System.out.println("------------------------------------------]");
        System.out.println("Digite 50 números inteiros positivos: ");
        System.out.println("------------------------------------------]");

        for (int i = 0; i < 50; i++) {
            posicoes[i] = sc.nextInt();

            System.out.println("------------------------------------------]");

        }
        System.out.println("------------------------------------------]");
        for (int i = 0; i < 50; i++) {

            if (posicoes[i] % 2 == 0 && posicoes[i] % 5 == 0) {
                System.out.println("O número " + posicoes[i] + " é par e multiplo de cinco");

                {

                    System.out.println("------------------------------------------]");

                }

            }
        }
    }
}