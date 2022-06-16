package sequencial;

import java.util.Scanner;

public class AumentarSalario2 {

	public static void main(String[] args) {

		double salarioBruto, percentual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o salário bruto: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		salarioBruto = salarioBruto * (1 + percentual/100);
		
		System.out.printf("O novo salario bruto é R$ %.2f", salarioBruto);
		
		sc.close();

	}

}
