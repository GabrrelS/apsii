
public class ProgramaDasFiguras {
	public static void main(String[] args) {
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		
// 3. a), b), c)
		
		Triangulo t1 = new Triangulo(3.5, 6.5);
		Losango l1 = new Losango(5.7, 6.8);
		Losango l2 =  new Losango(9.3, 4.9);
		Losango l3 = new Losango(3.6, 6.2);
		
		gerente.adicionaFigura(t1);;
		gerente.adicionaFigura(l1);
		gerente.adicionaFigura(l2);
		gerente.adicionaFigura(l3);

		
		System.out.println("Lista de figuras:\n");
		gerente.imprimeFiguras();
		System.out.println("\n----------\nInformações das figuras:\n");
		System.out.printf("%s \n\n%s \n\n%s \n\n%s \n\n", t1, l1, l2, l3);
		System.out.printf("\n----------\nTotal das áreas:\n%.2f\n\n", gerente.calculaAreaTotaldeFiguras());
		System.out.printf("------------\nMaior área:\n%.2f", gerente.getMaiorAreaDeFigura());
		
	}
}
