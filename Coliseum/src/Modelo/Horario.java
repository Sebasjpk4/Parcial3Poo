package Modelo;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author Alfonso
 */
public class Horario {

    private Date fecha;
    private Time hora_inicio;
    private Time hora_fin;

    public Horario(Date fecha, Time hora_inicio, Time hora_fin) {
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public boolean hayConflicto(Horario otroHorario) {
        if (!fecha.equals(otroHorario.fecha)) {
            return false;
        }

        if (hora_inicio.before(otroHorario.hora_fin)
                && hora_fin.after(otroHorario.hora_inicio)) {
            return true;
        }

        return false;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }
}
