package taxa;

import java.math.BigDecimal;

public interface TaxaEmbarqueStrategy {
    BigDecimal calcular(BigDecimal precoBase);
}
