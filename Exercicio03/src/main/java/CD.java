
public class CD extends Produto implements InfoGerais{
	protected int numFaixas;
	
	public CD(String nome, double preco, int numFaixas) {
		super(nome, preco);
		this.numFaixas = numFaixas;
	}
	
	@Override
	public String getNome() {
		return super.nome;
	}
	
	@Override
	public double getPreco() {
		return super.preco;
	}
			
	public int getNumFaixas() {
		return numFaixas;
	}
	
	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	public String exibirInformacoes() {
		return "Nome do CD: "+super.nome+"\nPreço do CD: "+super.preco+"\nNúmero de Faixas: %d"+numFaixas+"\n";
	}
}
