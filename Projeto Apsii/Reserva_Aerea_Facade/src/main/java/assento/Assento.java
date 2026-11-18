package assento;

import java.math.BigDecimal;

import taxa.TaxaEmbarqueStrategy;

	public class Assento {
    private final String numero;
    private final BigDecimal precoBase;
    private final TipoAssento tipo;
    private final TaxaEmbarqueStrategy taxaStrategy;

    public Assento(String numero, BigDecimal precoBase, TipoAssento tipo, TaxaEmbarqueStrategy taxaStrategy) {
        this.numero = numero;
        this.precoBase = precoBase;
        this.tipo = tipo;
        this.taxaStrategy = taxaStrategy;
    }

    public String getNumero() { return numero; }
    public BigDecimal getPrecoBase() { return precoBase; }
    public TipoAssento getTipo() { return tipo; }
    public String getTipoAssento() { return tipo.getDescricao(); }

    public BigDecimal calcularTaxaEmbarque() {
        return taxaStrategy.calcular(precoBase);
    }

    public BigDecimal calcularPrecoTotal() {
        return precoBase.add(calcularTaxaEmbarque());
    }
}
