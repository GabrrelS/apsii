package taxa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxaPercentualStrategy implements TaxaEmbarqueStrategy {
    private final BigDecimal percentual;

    public TaxaPercentualStrategy(String percentual) {
        this.percentual = new BigDecimal(percentual);
    }

    @Override
    public BigDecimal calcular(BigDecimal precoBase) {
        return precoBase.multiply(percentual).setScale(2, RoundingMode.HALF_UP);
    }
}
