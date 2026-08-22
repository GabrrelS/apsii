
public class Gerente extends FuncionarioCLT{
	private int tamanhoEquipe;
	private int percentualBonus;
	
	public Gerente(String nome, String matricula, double salarioBase,
	String dataAdmissao, double valeTransporte, double valeAlimentacao,
	int tamanhoEquipe, int percentualBonus){
		super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.percentualBonus = percentualBonus;
	}
	
	public int getTamanhoEquipe() {
		return tamanhoEquipe;
	}
	
	public int getPercentualBonus() {
		return percentualBonus; 
	}
	
	@Override
	public double calcularSalario() {
		double salarioCLT =  super.calcularSalario();
		double bonus = super.getSalarioBase() * percentualBonus/100.0;
		return salarioCLT + bonus;
	}
	
	@Override
	public double calcularDesconto() {
		double desconto = super.calcularDesconto();
		if (tamanhoEquipe > 10) {
			desconto += 100.0;
		}
		return desconto;
	}
	
	@Override
	public String toString() {
		double liquido = calcularSalario() - calcularDesconto();
		return String.format("Gerente: %s | Matricula: %s | Salário: %.2f | DtAdmss: %s\nVT: %.2f | VA: %.2f | Equipe: %d | Bônus: %d | Líquido: %.2f\n",
				super.getNome(), super.getMatricula(), calcularSalario(), super.getDataAdmissao(), super.getVT(), super.getVA(),
				tamanhoEquipe, percentualBonus, liquido);
	}
}