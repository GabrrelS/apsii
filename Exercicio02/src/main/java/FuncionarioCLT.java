
public class FuncionarioCLT extends Funcionario{
	private double valeTransporte;
	private double valeAlimentacao;
	
	public FuncionarioCLT(String nome, String matricula,
	double salarioBase, String dataAdmissao,
	double valeTransporte, double valeAlimentacao) {	
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;										
	}
	
	public double getVT() {
		return valeTransporte;
	}
	
	public double getVA() {
		return valeAlimentacao;
	}
	
	@Override
	public double calcularSalario() {
		return super.getSalarioBase()+valeTransporte+valeAlimentacao;
	}
	
	@Override
	public double calcularDesconto() {
		return super.calcularDesconto() + 50.0;
	}
	
	@Override
    public String toString() {
		double liquido = calcularSalario() - calcularDesconto();
		return String.format("FuncionarioCLT: %s | Matricula: %s | Salário: %.2f | DtAdmss: %s\nVT: %.2f | VA: %.2f | Líquido: %.2f\n",
				super.getNome(), super.getMatricula(), calcularSalario(), 
				super.getDataAdmissao(), getVT(), getVA(), liquido);
	}
}