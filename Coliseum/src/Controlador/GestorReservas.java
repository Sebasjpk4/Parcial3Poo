package Controlador;

import Modelo.Cancha;
import Modelo.Cliente;
import Modelo.ListaReservas;
import Modelo.Reserva;

/**
 *
 * @author Alfonso
 */
public class GestorReservas {

    private static GestorReservas instance;
    private int id_res = 0;

    private GestorReservas() {
    }

    public GestorReservas getInstance() {
        if (instance == null) {
            instance = new GestorReservas();
        }
        return instance;
    }

    public void registrarReserva(Cancha cancha, Cliente cliente, String tiempo) {
        Reserva res = new Reserva(id_res++, cancha, cliente, tiempo);
        ListaReservas.lista_reservas.add(res);
    }

    public void eliminarReserva(int id_reserva) {
        ListaReservas.lista_reservas.removeIf(res -> res.getIdreserva() == id_reserva);
    }

    public Reserva obtenerReserva(int id_reserva) {
        for (Reserva res : ListaReservas.lista_reservas) {
            if (res.getIdreserva() == id_reserva) {
                return res;
            }
        }
        return null;
    }
}
