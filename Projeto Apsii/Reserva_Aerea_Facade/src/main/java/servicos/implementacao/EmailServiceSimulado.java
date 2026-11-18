package servicos.implementacao;

import java.math.BigDecimal;
import assento.Assento;
import servicos.EmailService;

public class EmailServiceSimulado implements EmailService {
    @Override
    public void enviarConfirmacao(String email, String origem, String destino, Assento assento, BigDecimal valorTotal) {
        String detalhes = String.format("Voo %s -> %s | Assento: %s (%s) | Total: R$ %.2f",
            origem, destino, assento.getNumero(), assento.getTipoAssento(), valorTotal);
        
        System.out.println("[E-mail] Enviando confirmação para: " + email);
        System.out.println("[E-mail] " + detalhes);
    }
}
