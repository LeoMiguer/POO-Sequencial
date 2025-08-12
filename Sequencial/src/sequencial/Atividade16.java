package sequencial;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da área a ser pintada (m²): ");
        double area = sc.nextDouble();

        double litros = area / 6;

        int latas = (int) Math.ceil(litros / 18);
        double precoLatas = latas * 80;

        int galoes = (int) Math.ceil(litros / 3.6);
        double precoGaloes = galoes * 25;

        System.out.println("Apenas latas de 18L: " + latas + " latas - R$ " + precoLatas);
        System.out.println("Apenas galões de 3,6L: " + galoes + " galões - R$ " + precoGaloes);
        sc.close();
    }
}