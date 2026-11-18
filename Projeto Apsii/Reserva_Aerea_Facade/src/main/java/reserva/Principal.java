package reserva;

import java.math.BigDecimal;

import assento.Assento;
import assento.AssentoFactory;
import assento.TipoAssento;
import excecoes.ReservaException;
import facade.ReservaFacade;
import servicos.implementacao.DisponibilidadeServiceSimulado;
import servicos.implementacao.EmailServiceSimulado;
import servicos.implementacao.PagamentoServiceSimulado;
import taxa.TaxaPercentualStrategy;

public class Principal {

    public static void main(String[] args) {

        ReservaFacade facade = new ReservaFacade(
                new DisponibilidadeServiceSimulado("Manaus -> Lisboa"),
                new PagamentoServiceSimulado("000.000.000-00"),
                new EmailServiceSimulado());

        Assento economica = AssentoFactory.criar(TipoAssento.ECONOMICA, "12A", "400.00");
        Assento executiva = AssentoFactory.criar(TipoAssento.EXECUTIVA, "3C", "900.00");
        Assento primeira  = AssentoFactory.criar(TipoAssento.PRIMEIRA_CLASSE, "1A", "2500.00");

        Assento promocional = new Assento("20B", new BigDecimal("600.00"),
                TipoAssento.ECONOMICA, new TaxaPercentualStrategy("0.10"));

        System.out.println("CENÁRIOS DE SUCESSO (taxas diferentes por tipo de assento)");
        reservar(facade, "João Pessoa", "São Paulo", "123.456.789-00", "cliente1@email.com", economica);
        reservar(facade, "Recife", "Rio de Janeiro", "987.654.321-00", "cliente2@email.com", executiva);
        reservar(facade, "Brasília", "Miami", "111.222.333-44", "cliente3@email.com", primeira);
        reservar(facade, "Natal", "Salvador", "555.666.777-88", "cliente4@email.com", promocional);

        System.out.println("\nCENÁRIOS DE FALHA (exceções)");
        reservar(facade, "Manaus", "Lisboa", "222.333.444-55", "cliente5@email.com", primeira);
        reservar(facade, "Fortaleza", "Belém", "000.000.000-00", "cliente6@email.com", economica);
    }

    private static void reservar(ReservaFacade facade, String origem, String destino, String cpf, String email, Assento assento) {
        try {
            facade.reservarVoo(origem, destino, cpf, email, assento);
        } catch (ReservaException e) {
            System.out.println(">> ERRO (" + e.getClass().getSimpleName() + "): " + e.getMessage());
        }
    }
}