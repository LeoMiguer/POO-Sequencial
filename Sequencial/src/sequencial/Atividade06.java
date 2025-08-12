package sequencial;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double raio = scanner.nextDouble();
		double pi = 3.14159265358979323846;
		double area = pi * (raio*raio);
		
		System.out.println("A área do circulo é: "+area);
		
	}
	
}
