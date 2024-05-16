package Controlador;

import Modelo.Cancha;

/**
 *
 * @author Alfonso
 */
public class CanchaBuilder implements Builder {

    private static CanchaBuilder instance;
    private Cancha cancha;

    private CanchaBuilder() {
        this.cancha = new Cancha();
    }
    
    public static CanchaBuilder getInstance(){
        if (instance == null){
            instance = new CanchaBuilder();
        }
        return instance;
    }

    @Override
    public void setEntrenador(boolean entrenador) {
        cancha.setEntrenador(entrenador);
    }

    @Override
    public void setPesas(boolean pesas) {
        cancha.setPesas(pesas);
    }

    @Override
    public void setCauchos(boolean cauchos) {
        cancha.setCauchos(cauchos);
    }

    @Override
    public void setBotiquin(boolean botiquin) {
        cancha.setBotiquin(botiquin);
    }

    @Override
    public void setConos(boolean conos) {
        cancha.setConos(conos);
    }

    @Override
    public void setMedico(boolean medico) {
        cancha.setMedico(medico);
    }

    @Override
    public void reset() {
        cancha = new Cancha();
    }

    @Override
    public void setTipo(String tipo) {
        cancha.setTipo(tipo);
    }
}
