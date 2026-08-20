
public class Moto extends Veiculo{
	private int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}
	
	@Override
	public String imprimirDetalhes() {
		return super.imprimirDetalhes() + "Cilindradaas: "+ cilindradas;
	}
}