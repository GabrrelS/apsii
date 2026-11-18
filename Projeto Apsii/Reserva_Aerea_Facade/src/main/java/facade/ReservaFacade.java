package facade;

import java.math.BigDecimal;
import assento.Assento;
import excecoes.PagamentoRecusadoException;
import excecoes.VooIndisponivelException;
import servicos.DisponibilidadeService;
import servicos.EmailService;
import servicos.PagamentoService;

public class ReservaFacade {

    private final DisponibilidadeService disponibilidade;
    private final PagamentoService pagamento;
    private final EmailService email;

    public ReservaFacade(DisponibilidadeService disponibilidade, PagamentoService pagamento, EmailService email) {
        this.disponibilidade = disponibilidade;
        this.pagamento = pagamento;
        this.email = email;
    }

    public void reservarVoo(String origem, String destino, String cpf, String emailCliente, Assento assento) {
        System.out.println("\n=== INICIANDO RESERVA ===");

        if (!disponibilidade.verificarDisponibilidade(origem, destino)) {
            throw new VooIndisponivelException("Voo " + origem + " -> " + destino + " indisponível.");
        }

        BigDecimal valorTotal = assento.calcularPrecoTotal();

        if (!pagamento.processarPagamento(cpf, valorTotal)) {
        	throw new PagamentoRecusadoException("Pagamento recusado para o CPF: " + cpf);
        }

        email.enviarConfirmacao(emailCliente, origem, destino, assento, valorTotal);

        System.out.println("=== RESERVA CONCLUÍDA COM SUCESSO ===");
    }
}
