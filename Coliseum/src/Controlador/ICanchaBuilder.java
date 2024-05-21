package Controlador;

import Modelo.Cancha;

/**
 *
 * @author Alfonso
 */
public interface ICanchaBuilder {

    public void setTipo(String tipo);

    public void setEntrenador(boolean entrenador);

    public void setPesas(boolean pesas);

    public void setCauchos(boolean cauchos);

    public void setBotiquin(boolean botiquin);

    public void setConos(boolean conos);

    public void setMedico(boolean medico);
    
    public Cancha getCancha();

    public void reset();
}
