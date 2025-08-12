package sequencial;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
    	
    	
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da área a ser pintada (m²): ");
        double area = sc.nextDouble();

        double litros = area / 3;
        int latas = (int) Math.ceil(litros / 18);
        double preco = latas * 80;

        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Preço total: R$ " + preco);
        sc.close();
    }
}