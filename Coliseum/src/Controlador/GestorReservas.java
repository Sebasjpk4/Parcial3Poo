package Controlador;

import Modelo.ListaReservas;
import Modelo.Reserva;
import javax.swing.JFrame;

/**
 *
 * @author Alfonso
 */
public class GestorReservas {

    private static GestorReservas instance;
    private ListaReservas reservas;
    private JFrame vista;

    private GestorReservas(ListaReservas reservas, JFrame vista) {
        this.reservas = reservas;
        this.vista = vista;
    }

    public static GestorReservas getInstance(ListaReservas reservas, JFrame vista) {
        if (instance == null) {
            instance = new GestorReservas(reservas, vista);
        }
        return instance;
    }
    
    public void crearReservacion(Reserva reserva){
        reservas.registrarReserva(reserva);
    }
    
    public void editarReservacion(Reserva reserva){
        reservas.editarReserva(reserva);
    }
    
    public void cancelarReservacion(int idreserva){
        reservas.eliminarReserva(idreserva);
    }
}
