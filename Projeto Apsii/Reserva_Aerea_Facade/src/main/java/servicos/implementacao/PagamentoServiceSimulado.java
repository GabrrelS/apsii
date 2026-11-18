package servicos.implementacao;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import servicos.PagamentoService;

public class PagamentoServiceSimulado implements PagamentoService {

    private final Set<String> cpfsBloqueados;

    public PagamentoServiceSimulado(String... cpfsBloqueados) {
        this.cpfsBloqueados = new HashSet<>(Arrays.asList(cpfsBloqueados));
    }

    @Override
    public boolean processarPagamento(String cpf, BigDecimal valor) {
        System.out.printf("[Pagamento] Processando R$ %.2f para o CPF: %s%n", valor, cpf);

        if (cpfsBloqueados.contains(cpf)) {
            System.out.println("[Pagamento] Cartão recusado!");
            return false;
        }
        return true;
    }
}
