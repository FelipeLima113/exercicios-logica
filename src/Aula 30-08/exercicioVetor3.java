import java.util.Scanner;

public class exercicioVetor3 {

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite 50 números inteiros positivos: ");

            int posicoes[] = new int[50];
            for (int i = 0; i < 50; i++) {
                posicoes[i] = sc.nextInt();

            }


        }
    }
}