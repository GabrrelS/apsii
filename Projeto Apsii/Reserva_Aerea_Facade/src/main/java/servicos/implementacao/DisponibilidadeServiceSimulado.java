package servicos.implementacao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import servicos.DisponibilidadeService;

public class DisponibilidadeServiceSimulado implements DisponibilidadeService {

    private final Set<String> voosLotados;

    public DisponibilidadeServiceSimulado(String... voosLotados) {
        this.voosLotados = new HashSet<>(Arrays.asList(voosLotados));
    }

    @Override
    public boolean verificarDisponibilidade(String origem, String destino) {
        System.out.println("[Disponibilidade] Verificando voo " + origem + " -> " + destino);

        if (voosLotados.contains(origem + " -> " + destino)) {
            System.out.println("[Disponibilidade] Voo lotado!");
            return false;
        }
        return true;
    }
}
