package sequencial;

import java.util.Scanner;

public class AumentarSalario {

	public static void main(String[] args) {
		
		double salarioBruto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do sal�rio bruto: ");
		salarioBruto = sc.nextDouble();
		
		salarioBruto = salarioBruto * 1.05;
		
		System.out.printf("O salario ajustado � R$ %.2f", salarioBruto);
		
		sc.close();
		
	}

}
