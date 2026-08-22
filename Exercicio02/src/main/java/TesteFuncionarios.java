
public class TesteFuncionarios {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500, "01/03/2020");
		FuncionarioCLT clt1 = new FuncionarioCLT("Bruno Reis", "C001", 3000, "10/06/2021", 220, 400);
		Gerente grnt1 = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018", 300, 500, 12, 20);
		Estagiario estag1 = new Estagiario("Diego Alves", "E001", 0, "05/08/2024", 1500, 20);
		Diretor drt1 = new Diretor("José Mário", "R001", 8000, "04/07/2022", 300, 500, 12, 20, 2500);
			
		System.out.println(f1);
		System.out.println(clt1);
		System.out.println(grnt1);
		System.out.println(drt1);
		System.out.println(estag1);
	}
}