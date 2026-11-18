package taxa;

import java.math.BigDecimal;

public class TaxaFixaStrategy implements TaxaEmbarqueStrategy {
    private final BigDecimal valor;

    public TaxaFixaStrategy(String valor) {
        this.valor = new BigDecimal(valor);
    }

    @Override
    public BigDecimal calcular(BigDecimal precoBase) {
        return valor;
    }
}
