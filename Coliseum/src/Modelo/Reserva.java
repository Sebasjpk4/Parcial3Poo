package Modelo;

import java.util.Date;

/**
 *
 * @author Alfonso
 */
public class Reserva {

    private int id = 1;
    private int idreserva;
    private Cancha cancha;
    private Cliente cliente;
    private Date inicio;
    private Date fin;

    public Reserva() {
        this.idreserva = id++;
    }

    public Reserva(Cancha cancha, Cliente cliente, Date inicio, Date fin) {
        this.idreserva = id++;
        this.cancha = cancha;
        this.cliente = cliente;
        this.inicio = inicio;
        this.fin = fin;
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

}
