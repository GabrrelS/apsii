
public class Banco {
	private String nome;
	private String cpf;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Banco(String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public Banco() {
		this.nome = "Sem Nome";
		this.cpf = "Sem CPF";
		this.saldo = 0;
	}
}