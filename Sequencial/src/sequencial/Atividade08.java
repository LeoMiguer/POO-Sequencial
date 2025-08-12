package sequencial;

import java.util.Scanner;

public class Atividade08 {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Quanto você ganha por hora: ");
		double valor_por_hora = scanner.nextDouble();
		System.out.print("Quantas horas você trabalha por dia: ");
		
		double horas_por_dia = scanner.nextDouble();
		
		double valor_por_dia = horas_por_dia * valor_por_hora;
		
		double valor_por_semana = valor_por_dia * 5;
		
		double valor_por_mes = valor_por_semana * 4;
		
		System.out.println("Você ganha " + valor_por_mes + " por mês");
		
	}
	

}
