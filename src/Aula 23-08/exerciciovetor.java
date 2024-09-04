import java.util.Scanner;

public class exerciciovetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------|");
        System.out.println("Digite uma sequência de números inteiros: ");
        System.out.println("-----------------------------------------|");

        int ordem [] = new int [5];

        for (int j = 0; j < 5; j++){

            ordem[j] = sc.nextInt();

            System.out.println("-----------------------------------------|");
        }

        System.out.println("Os números inteiros na ordem inversa são:");
        System.out.println("-----------------------------------------|");

        for (int j = 4 ; j > -1 ; j--){

            System.out.println(ordem[j]);

            System.out.println("-----------------------------------------|");

        }
    }
}

