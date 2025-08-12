package sequencial;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura (em metros): ");
        double h = sc.nextDouble();
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * h) - 58;
        } else {
            pesoIdeal = (62.1 * h) - 44.7;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        sc.close();
    }
}