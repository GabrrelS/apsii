package assento;

public enum TipoAssento {
    ECONOMICA("Econômica"),
    EXECUTIVA("Executiva"),
    PRIMEIRA_CLASSE("Primeira Classe");

    private final String descricao;

    TipoAssento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
