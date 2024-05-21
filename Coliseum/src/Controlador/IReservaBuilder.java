package Controlador;

import Modelo.Cancha;
import Modelo.Cliente;
import Modelo.Horario;
import Modelo.Reserva;

/**
 *
 * @author Alfonso
 */
public interface IReservaBuilder {

    public void setCancha(Cancha cancha);

    public void setCliente(Cliente cliente);

    public void setHorario(Horario horario);
    
    public Reserva getReserva();
    
    public void reset();
}
