
public class Livro extends Produto {
	private String autor;
	
	public Livro(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}
	
	@Override
	public String getNome() {
		return super.nome;
	}
	
	@Override
	public double getPreco() {
		return super.preco;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
