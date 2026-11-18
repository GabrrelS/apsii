package assento;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.Map;

import taxa.TaxaEmbarqueStrategy;
import taxa.TaxaFixaStrategy;

public class AssentoFactory {

    private static final Map<TipoAssento, TaxaEmbarqueStrategy> ESTRATEGIAS =
            new EnumMap<>(TipoAssento.class);

    static {
        ESTRATEGIAS.put(TipoAssento.ECONOMICA, new TaxaFixaStrategy("50.00"));
        ESTRATEGIAS.put(TipoAssento.EXECUTIVA, new TaxaFixaStrategy("120.00"));
        ESTRATEGIAS.put(TipoAssento.PRIMEIRA_CLASSE, new TaxaFixaStrategy("300.00"));
    }

    private AssentoFactory() { }

    public static Assento criar(TipoAssento tipo, String numero, String precoBase) {
        TaxaEmbarqueStrategy strategy = ESTRATEGIAS.get(tipo);
        
        if (strategy == null) {
            throw new IllegalArgumentException("Tipo de assento sem estratégia: " + tipo);
        }
        
        return new Assento(numero, new BigDecimal(precoBase), tipo, strategy);
    }
}
