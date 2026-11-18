package servicos;

import java.math.BigDecimal;
import assento.Assento;

public interface EmailService {
    void enviarConfirmacao(String email, String origem, String destino, Assento assento, BigDecimal valorTotal);
}
