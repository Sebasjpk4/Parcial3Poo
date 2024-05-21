package Modelo;

import java.util.Vector;

/**
 *
 * @author Alfonso
 */
public class ListaReservas {

    private static ListaReservas instance;
    private Vector<Reserva> lista_reservas = new Vector<>();

    private ListaReservas() {
    }

    public static ListaReservas getInstance(){
        if (instance == null) {
            instance = new ListaReservas();
        }
        return instance;
    }
    public void registrarReserva(Reserva reserva) {
        lista_reservas.add(reserva);
    }

    public void eliminarReserva(int id_reserva) {
        lista_reservas.removeIf(res -> res.getIdreserva() == id_reserva);
    }

    public Reserva obtenerReserva(int id_reserva) {
        for (Reserva res : lista_reservas) {
            if (res.getIdreserva() == id_reserva) {
                return res;
            }
        }
        return null;
    }

    public void editarReserva(Reserva reserva) {
        for (int i = 0; i < lista_reservas.size(); i++) {
            if (lista_reservas.get(i).getIdreserva() == reserva.getIdreserva()) {
                lista_reservas.set(i, reserva);
                return;
            }
        }
    }

    public boolean validarHorario(Reserva reserva) {
        for (Reserva res : lista_reservas) {
            if (res.getCancha().getTipo().equals(reserva.getCancha().getTipo())
                    && res.getHorario().hayConflicto(reserva.getHorario())) {
                return false;
            }
        }
        return true;
    }
}
