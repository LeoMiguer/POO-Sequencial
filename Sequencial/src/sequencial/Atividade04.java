package sequencial;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int nota1 = scanner.nextInt();
		int nota2 = scanner.nextInt();
		int nota3 = scanner.nextInt();
		int nota4 = scanner.nextInt();
		
		System.out.println("A média é: " + (nota1+nota2+nota3+nota4)/4);
		
	}
}
