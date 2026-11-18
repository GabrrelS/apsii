package servicos;

import java.math.BigDecimal;

public interface PagamentoService {
    boolean processarPagamento(String cpf, BigDecimal valor);
}
