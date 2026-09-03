import java.util.Scanner;


public class Principal{	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o nome do livro:");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o preço do livro:");
		double preco = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Informe o autor do livro:");
		String autor = scanner.nextLine();
		
		Livro livro = new Livro(nome, preco, autor);
		
		
	
		System.out.println("Informe o nome do CD:");
		String nomeCD = scanner.nextLine();
		
		System.out.println("Informe o preço do CD:");
		double precoCD = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Informe o autor do CD:");
		int numFaixasCD = scanner.nextInt();
		
		CD cd = new CD(nomeCD, precoCD, numFaixasCD);
		
		System.out.println(cd.exibirInformacoes());
		
		System.out.printf("Nome: %s\n", livro.getNome());
		System.out.printf("Preço: %.2f\n", livro.getPreco());
		System.out.printf("Autor: %s\n", livro.getAutor());
			
	}
}