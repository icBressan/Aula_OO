package Builder;

import AbstractFactory.Servico;
import FactoryMethod.Quarto;
import java.util.List;

//é a classe "construtora" (Builder).
public class ReservaBuilder {
    
//monta um objeto Reserva aos poucos usando métodos que preenchem os dados.
    private Reserva reserva;

    public ReservaBuilder() {
        this.reserva = new Reserva(); // começa com uma reserva vazia
    }
    
    //Métodos que montam a reserva
    public ReservaBuilder setNomeHospede(String nome) {
        reserva.setNomeHospede(nome);
        return this;
    }
    
    public ReservaBuilder setDataEntrada(String dataEntrada) {
        reserva.setDataEntrada(dataEntrada);
        return this;
    }

    public ReservaBuilder setDataSaida(String dataSaida) {
        reserva.setDataSaida(dataSaida);
        return this;
    }

    public ReservaBuilder setNumeroHospedes(int numero) {
        reserva.setNumeroHospedes(numero);
        return this;
    }

    public ReservaBuilder setQuarto(Quarto quarto) {
        reserva.setQuarto(quarto);
        return this;
    }

    public ReservaBuilder setServicos(List<Servico> servicos) {
        reserva.setServicos(servicos);
        return this;
    }

    // Retorna a reserva pronta 
    public Reserva build() {
        return reserva;
    }
    
}
