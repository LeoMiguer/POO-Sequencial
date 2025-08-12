package sequencial;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double numero_em_metros = scanner.nextInt();
		double numero_em_centimetros = numero_em_metros * 100;
		
		System.out.println("Seu número em centímetros é: "+numero_em_centimetros);

	}

}
