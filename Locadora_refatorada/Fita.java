public class Fita {

	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int INFANTIL = 2;

	private String titulo;
	private Preco preco;

	public Fita(String titulo, int codigoDePreco) {
		this.titulo = titulo;
		setcodigoDePreco(codigoDePreco);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCodigoDePreco() {
		return preco.getCodigo();
	}

	public void setcodigoDePreco(int codPreco) {
		switch (codPreco) {
			case NORMAL:
				preco = new PrecoNormal();
				break;
				
			case LANCAMENTO:
				preco = new PrecoLancamento();
				break;
				
			case INFANTIL:
				preco = new PrecoInfantil();
				break;
				
			default:
				throw new IllegalArgumentException("Código de preço inválido: " + codPreco);
		}
	}

	// delega ao objeto Preco
	public double getValor(int diasAlugada) {
		return preco.getValor(diasAlugada);
	}

	public int getPontos(int diasAlugada) {
		return preco.getPontos(diasAlugada);
	}
}
