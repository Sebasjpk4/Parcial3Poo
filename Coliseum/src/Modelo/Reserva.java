package Modelo;

/**
 *
 * @author Alfonso
 */
public class Reserva {

    private int id = 1;
    private int idreserva;
    private Cancha cancha;
    private Cliente cliente;
    private Horario horario;

    public Reserva() {
        this.idreserva = id++;
    }

    public Reserva(Cancha cancha, Cliente cliente, Horario horario) {
        this.idreserva = id++;
        this.cancha = cancha;
        this.cliente = cliente;
        this.horario = horario;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
