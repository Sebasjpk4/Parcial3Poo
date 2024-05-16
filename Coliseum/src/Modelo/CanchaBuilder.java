package Modelo;

/**
 *
 * @author Alfonso
 */
public interface CanchaBuilder {
    
    public void setEntrenador(boolean entrenador);
            
    public void setPesas(boolean pesas);
    
    public void setCauchos(boolean cauchos);
    
    public void setBotiquin(boolean botiquin);
    
    public void setConos(boolean conos);
    
    public void setMedico(boolean medico);
    
    public void reset();
}
