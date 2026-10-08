public class Aluguel {
	private int diasAlugada;
	private Fita fita;

	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}

	public Fita getFita() {
		return fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}

	// Move Method: o cálculo agora vive junto dos dados que usa
	public double getValor() {
		return fita.getValor(diasAlugada);
	}

	public int getPontos() {
		return fita.getPontos(diasAlugada);
	}
}
