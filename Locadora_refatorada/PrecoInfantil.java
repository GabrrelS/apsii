public class PrecoInfantil extends Preco {
	public int getCodigo() { return Fita.INFANTIL; }

	public double getValor(int diasAlugada) {
		double valor = 1.5;
		if (diasAlugada > 3)
			valor += (diasAlugada - 3) * 1.5;
		return valor;
	}
}