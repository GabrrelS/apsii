
public class Carro extends Veiculo{
	private int numPortas;
	 
	public Carro(String modelo, int ano, int numPortas) {
		super(modelo, ano);
		this.numPortas = numPortas;
	}
	
	@Override
	public String imprimirDetalhes() {
		return super.imprimirDetalhes() +"Número de Portas: "+ numPortas +"\n";
	}
}