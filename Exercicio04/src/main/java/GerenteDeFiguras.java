import java.util.ArrayList; import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras;
	
	public GerenteDeFiguras() {
		figuras = new ArrayList<FiguraGeometrica>();
	}
// 2. Implemente ao menos 3 (TRÊS) dos métodos da classe GerenteDeFiguras
	public void adicionaFigura(FiguraGeometrica fig) {
		figuras.add(fig);
	}
	
	public void imprimeFiguras() {
		for (FiguraGeometrica fig : figuras) {
			System.out.println(fig.getNomeFigura());
		}
	}
	
	public double calculaAreaTotaldeFiguras() {
		double total = 0;
		
		for (FiguraGeometrica fig : figuras) {
			total += fig.calculaArea();
		}
		return total;
	}
	
	public double getMaiorAreaDeFigura() {
		double maiorArea = 0;
		
		for(FiguraGeometrica fig : figuras) {
			if (fig.calculaArea() > maiorArea) {
				maiorArea = fig.calculaArea();
			}
		}
		return maiorArea;
	}
}
