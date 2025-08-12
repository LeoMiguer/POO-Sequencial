package sequencial;
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso dos peixes (kg): ");
        double peso = sc.nextDouble();

        double excesso = peso - 50;
        double multa = 0;
        if (excesso > 0) {
            multa = excesso * 4.0;
        } else {
            excesso = 0;
        }

        System.out.println("Excesso: " + excesso + " kg");
        System.out.println("Multa: R$ " + multa);
        sc.close();
    }
}