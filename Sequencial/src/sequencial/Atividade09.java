package sequencial;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) / 1.8;
        System.out.println("A temperatura em Celsius é: " + c);
        sc.close();
    }
}