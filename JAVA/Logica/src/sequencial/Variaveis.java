package sequencial;

public class Variaveis {

	public static void main(String[] args) {
		
		int quantidade = 1500;
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		char vendido = 'S';
		
		System.out.printf("A quantidade de itens em estoque ? %d\n", quantidade);
		System.out.printf("O valor da parcela ? R$%.1f\n", valorMercadoria);
		System.out.printf("O seu Ger?nimo pesa %f quilos\n", peso);
		System.out.printf("Temos uma quantidade %c de produtos (%d - 500) em estoque\n", vendido, quantidade);

	}

}
