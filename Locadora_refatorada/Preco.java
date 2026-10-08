/** State/Strategy: cada tipo de fita sabe calcular o próprio preço e pontos. */
public abstract class Preco {
	public abstract int getCodigo();
	public abstract double getValor(int diasAlugada);

	// comportamento padrão: 1 ponto por aluguel
	public int getPontos(int diasAlugada) {
		return 1;
	}
}