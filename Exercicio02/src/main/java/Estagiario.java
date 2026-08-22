
public class Estagiario extends Funcionario{
	private double valorBolsaAuxilio;
	private int cargaHorariaSemanal;
	
	public Estagiario(String nome, String matricula, double salarioBase, 
	String dataAdmissao, double valorBolsaAuxilio, int cargaHorariaSemanal) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valorBolsaAuxilio = valorBolsaAuxilio;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}

	public double getValorBolsaAuxilio() {
		return valorBolsaAuxilio;
	}
	
	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}
	
	@Override
	public double calcularSalario() {
		return super.getSalarioBase();
	}
	
	@Override
	public double calcularDesconto() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return String.format("Estagiário: %s | Matrícula: %s | Salário: %.2f | DtAdmss: %s\nBolsa: %.2f | Carga Horária: %d\n",
				super.getNome(), super.getMatricula(), calcularSalario(), super.getDataAdmissao(), valorBolsaAuxilio, cargaHorariaSemanal);
	}
}