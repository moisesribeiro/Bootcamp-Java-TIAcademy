package sequencial;

import java.util.Scanner;

public class DescontoINSS {

	public static void main(String[] args) {
		
		double salarioBruto, desconto = 0.89;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o sal�rio bruto: ");
		salarioBruto = sc.nextDouble();
		
		salarioBruto = salarioBruto * desconto;
		
		System.out.printf("O salario bruto com desconto do INSS � R$ %.2f", salarioBruto);
		
		sc.close();

	}

}
