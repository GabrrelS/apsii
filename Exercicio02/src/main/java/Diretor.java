
public class Diretor extends Gerente{
	private double participacaoLucros;
	
	public Diretor(String nome, String matricula, double salarioBase,
	String dataAdmissao, double valeTransporte, double valeAlimentacao,
	int tamanhoEquipe, int percentualBonus, double participacaoLucros){
		super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe,
				percentualBonus);
		this.participacaoLucros = participacaoLucros;
	}
	
	public double getParticipacaoLucros() {
		return participacaoLucros;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + participacaoLucros;
	}
	
	@Override
	public String toString() {
		double liquido = calcularSalario() - super.calcularDesconto();
		return String.format("Diretor: %s | Matricula: %s | Salário: %.2f | DtAdmss: %s\nVT: %.2f | VA: %.2f | Equipe: %d | Bônus: %d | Participação em Lucros: %.2f | Líquido: %.2f\n",
				super.getNome(), super.getMatricula(), calcularSalario(), super.getDataAdmissao(), super.getVT(), super.getVA(),
				super.getTamanhoEquipe(), super.getPercentualBonus(), participacaoLucros, liquido);
	}
}
