package Singleton;

import Builder.Reserva;
import java.util.ArrayList;
import java.util.List;

//classe que guarda todas as reservas feitas.
//usa Singleton para que todo o programa compartilhe a mesma lista de reservas, 
//sem precisar passar essa lista entre classes.
public class GerenciadorReservas {
    private static GerenciadorReservas instancia;  // guarda a instância única
    private List<Reserva> reservas = new ArrayList<>(); // lista interna

    //construtor privado para evitar instaciacao externa
    private GerenciadorReservas() {}

    //metodo público estático para acesso global a instância
    public static GerenciadorReservas getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorReservas();
        }
        return instancia;
    }

    // Adiciona uma reserva à lista
    public void adicionarReserva(Reserva r) {
        reservas.add(r);
    }

    // Retorna uma cópia da lista de reservas (para evitar modificar internamente)
    public List<Reserva> getTodasReservas() {
        return new ArrayList<>(reservas);
    }

    // Retorna a última reserva adicionada (ou null se não houver)
    public Reserva getUltimaReserva() {
        if (reservas.isEmpty()) return null;
        return reservas.get(reservas.size() - 1);
    }
}
