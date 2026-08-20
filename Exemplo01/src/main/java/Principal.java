
public class Principal {
	public static void main(String[] args) {
		Banco banco1 = new Banco();
		Banco banco2 = new Banco("José", "473.432.433-12", 20);
		
		System.out.println(banco1.getSaldo());
		banco1.setSaldo(10);
		System.out.println(banco1.getSaldo());
	}
}