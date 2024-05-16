package Modelo;

/**
 *
 * @author Alfonso
 */
public class Reserva {

    private int idreserva;
    private Cancha cancha;
    private Cliente cliente;
    private String tiempo;

    public Reserva() {
    }

    public Reserva(int idreserva, Cancha cancha, Cliente cliente, String tiempo) {
        this.idreserva = idreserva;
        this.cancha = cancha;
        this.cliente = cliente;
        this.tiempo = tiempo;
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

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
