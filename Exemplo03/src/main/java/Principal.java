
public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Civic", 2015);
		Carro c1 = new Carro("Civic", 2015, 4);
		Moto m1 = new Moto("Bros", 2011, 150);
		
		System.out.println(v1.imprimirDetalhes());
		System.out.println(c1.imprimirDetalhes());
		System.out.println(m1.imprimirDetalhes());
	}
}