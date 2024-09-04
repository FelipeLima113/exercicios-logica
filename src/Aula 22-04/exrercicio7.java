import java.util.Scanner;

public class exrercicio7 {
    public static void main(String[] args) {
        Scanner valordigitado = new Scanner(System.in);
        System.out.println("Digite o tempo gasto na viagem(Hora): ");
        double t_gasto = valordigitado.nextDouble();
        System.out.println("Digite a velocidade média do móvel(Km/h): ");
        double v_media = valordigitado.nextDouble();
        double distancia = t_gasto * v_media;
        double litros_usados = distancia / 12;
        System.out.println("O valor da velocidade média é: "+v_media);
        System.out.println("O tempo gasto na viagem é: "+t_gasto);
        System.out.println("A distância percorrida foi: "+distancia);
        System.out.println("O total de litros gastos na viagem: "+litros_usados);


    }
}
