
import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

	private ArrayList<Aniversariante> aniversariantes;

	public MinhaAgendaDeAniversarios() {
		this.aniversariantes = new ArrayList<Aniversariante>();
	}

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		Aniversariante novoAniversariante = new Aniversariante(nome, dia, mes);
		aniversariantes.add(novoAniversariante);
	}

	@Override
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
		ArrayList<String> nomesDoDia = new ArrayList<String>();
		DataAniversario dataProcurada = new DataAniversario(dia, mes);

		for (int i = 0; i < aniversariantes.size(); i++) {
			Aniversariante aniversariante = aniversariantes.get(i);
			if (aniversariante.getDataAniversario().equals(dataProcurada)) {
				nomesDoDia.add(aniversariante.getNome());
			}
		}
		return nomesDoDia;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) {
		for (int i = aniversariantes.size() - 1; i >= 0; i--) {
			if (aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
				aniversariantes.remove(i);
			}
		}
	}
}