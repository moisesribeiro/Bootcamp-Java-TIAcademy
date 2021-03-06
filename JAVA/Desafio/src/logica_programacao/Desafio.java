package logica_programacao;
import java.util.Scanner;


public class Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		double impostoC = 62.59, impostoE = 56.86, impostoV = 61.58,
				lucroC = 0.30, lucroE = 0.35, lucroV = 0.50, precoUnitario = 0,
				totalEstoqueC = 0, totalEstoqueE = 0, totalEstoqueV = 0 ;
		int quantidadeC = 0, quantidadeE = 0, quantidadeV = 0, total = 0;
		char C , E, V;
		String produto;
		
		//lucroC = precoUnitario * lucroC - impostoC;
		//lucroE = precoUnitario * lucroE - impostoE;
		//lucroV = precoUnitario * lucroV - impostoV;
		
		do {
		
		System.out.print("Informe a categoria do produto\n[C] - [Cama, mesa e banho] | "
				+ "[E] - Eletrodom?sticos | [V] - Vestu?rio: ");
		char categoria = sc.next().charAt(0);
		categoria = Character.toUpperCase(categoria);
		
		if(categoria == 'C') {
			quantidadeC++;
			total++;
		}
		
		else if(categoria == 'E') {
			quantidadeE++;
			total++;
		}
		else if (categoria == 'V'){
			quantidadeV++;
			total++;
		}
		else {
			System.out.println("Digitar uma categoria v?lida: ");
		}
		
		System.out.print("Informe o produto a ser registrado: ");
		produto = sc.next();
		
		System.out.print("Informe o valor unit?rio do produto: ");
		precoUnitario = sc.nextDouble();
		
		if(categoria == 'C') {
			impostoC = precoUnitario * (37.41 / 100);
			lucroC =  (precoUnitario - impostoC) * 0.3;
			totalEstoqueC = precoUnitario + lucroC + impostoC;
			System.out.println("\n");
		}
		else if(categoria == 'E') {
			impostoE = precoUnitario * (43.14 / 100);
			lucroE =  (precoUnitario - impostoE) * 0.35;
			totalEstoqueE = precoUnitario + lucroE + impostoE;
			System.out.println("\n");	
		}
		else if (categoria == 'V') {
			impostoV = precoUnitario * (38.14 / 100);
			lucroV =  (precoUnitario - impostoV) * 0.5;
			totalEstoqueV = precoUnitario + lucroV + impostoV;
			System.out.println("\n");	
		}
		else {
			System.out.println("N?o foi poss?vel calcular os valores dos produtos: ");
		}
		
		//if(total > 14) {
		//	System.out.println("Limite de registro de produtos atingido: ");
		//}
		
		} while(total <= 14);
			
		System.out.printf("Produtos [Cama, mesa e banho] em estoque: %d | Valor Total: %.2f | Lucro: %.2f\n",quantidadeC, totalEstoqueC, lucroC);
		System.out.printf("Produtos [Eletrodom?sticos] em estoque: %d | Valor Total: %.2f | Lucro: %.2f\n",quantidadeE, totalEstoqueE, lucroE);
		System.out.printf("Produtos [Vestu?rio] em estoque: %d | Valor Total: %.1f | Lucro: %.2f\n",quantidadeV , totalEstoqueV, lucroV);
	   
		sc.close();
	}
}