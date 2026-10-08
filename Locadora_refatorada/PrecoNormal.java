public class PrecoNormal extends Preco {
	public int getCodigo() { return Fita.NORMAL; }

	public double getValor(int diasAlugada) {
		double valor = 2;
		if (diasAlugada > 2)
			valor += (diasAlugada - 2) * 1.5;
		return valor;
	}
}