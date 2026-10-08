import java.util.*;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + "\n");

        for (Aluguel aluguel : alugueis) {
            resultado.append("\t").append(aluguel.getFita().getTitulo())
                     .append("\t").append(aluguel.getValor()).append("\n");
        }

        resultado.append("Valor total devido: ").append(getValorTotal()).append("\n");
        resultado.append("Você ganhou ").append(getTotalPontos()).append(" pontos de alugador frequente");
        return resultado.toString();
    }

    // Extract Method + Replace Temp with Query
    private double getValorTotal() {
        double total = 0;
        for (Aluguel aluguel : alugueis)
            total += aluguel.getValor();
        return total;
    }

    private int getTotalPontos() {
        int pontos = 0;
        for (Aluguel aluguel : alugueis)
            pontos += aluguel.getPontos();
        return pontos;
    }
}
