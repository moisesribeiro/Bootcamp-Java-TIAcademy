package sequencial;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		double media, n1, n2, n3, n4;
		int p1 = 2; 
		int p2 = 3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da 1� nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o valor da 2� nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite o valor da 3� nota: ");
		n3 = sc.nextDouble();
		System.out.println("Digite o valor da 4� nota: ");
		n4 = sc.nextDouble();
		
		media = (n1 * p1 + n2 * p1 + n3 * p2 + n4 * p2) / 10;
		
		System.out.printf("A m�dia ponderada de %.2f + %.2f + %.2f + %.2f � = %.2f", n1, n2, n3, n4, media);
		
		sc.close();
		

	}

}
