package sequencial;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();
        System.out.print("Digite um número real: ");
        double n3 = sc.nextDouble();

        double a = (2 * n1) * (n2 / 2.0);
        double b = (3 * n1) + n3;
        double c = Math.pow(n3, 3);

        System.out.println("a) Produto do dobro do primeiro com metade do segundo: " + a);
        System.out.println("b) Soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("c) Terceiro elevado ao cubo: " + c);
        sc.close();
    }
}