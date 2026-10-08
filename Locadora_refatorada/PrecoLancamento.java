public class PrecoLancamento extends Preco {
	public int getCodigo() { return Fita.LANCAMENTO; }

	public double getValor(int diasAlugada) {
		return diasAlugada * 3;
	}

	public int getPontos(int diasAlugada) {
		return diasAlugada > 1 ? 2 : 1;
	}
}