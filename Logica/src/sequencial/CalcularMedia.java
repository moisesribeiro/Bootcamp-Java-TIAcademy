package sequencial;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da 1� nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o valor da 2� nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite o valor da 3� nota: ");
		n3 = sc.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.printf("A m�dia de %.2f + %.2f + %.2f � = %.2f", n1, n2, n3, media);
		
		sc.close();
		
	}

}