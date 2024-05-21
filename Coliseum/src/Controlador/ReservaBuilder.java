package Controlador;

import Modelo.Cancha;
import Modelo.Cliente;
import Modelo.Horario;
import Modelo.Reserva;

/**
 *
 * @author Alfonso
 */
public class ReservaBuilder implements IReservaBuilder {

    private static ReservaBuilder instance;
    private Reserva reserva;

    public ReservaBuilder() {
        this.reserva = new Reserva();

    }

    public static ReservaBuilder getInstance() {
        if (instance == null) {
            instance = new ReservaBuilder();
        }
        return instance;
    }

    @Override
    public void setCancha(Cancha cancha) {
        reserva.setCancha(cancha);
    }

    @Override
    public void setCliente(Cliente cliente) {
        reserva.setCliente(cliente);
    }

    @Override
    public void setHorario(Horario horario) {
        reserva.setHorario(horario);
    }

    @Override
    public void reset() {
        reserva = new Reserva();
    }

    @Override
    public Reserva getReserva() {
        return reserva;
    }
}
