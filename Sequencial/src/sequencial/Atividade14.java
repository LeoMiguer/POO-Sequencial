package sequencial;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o quanto você ganha por hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Quantas horas tu trabalha no mês: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("+ Salário Bruto: R$ " + salarioBruto);
        System.out.println("- IR (11%): R$ " + ir);
        System.out.println("- INSS (8%): R$ " + inss);
        System.out.println("- Sindicato (5%): R$ " + sindicato);
        System.out.println("= Salário Líquido: R$ " + salarioLiquido);
        sc.close();
    }
}