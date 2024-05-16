package Modelo;

public class Cancha {

    private int cantidad;
    private float valor;
    private String tipo;
    private boolean entrenador;
    private boolean pesas;
    private boolean cauchos;
    private boolean botiquin;
    private boolean conos;
    private boolean medico;

    public Cancha() {
        this.entrenador = false;
        this.pesas = false;
        this.cauchos = false;
        this.botiquin = false;
        this.conos = false;
        this.medico = false;
    }

    public Cancha(int cantidad, float valor, String tipo) {
        this.cantidad = cantidad;
        this.valor = valor;
        this.tipo = tipo;
        this.entrenador = false;
        this.pesas = false;
        this.cauchos = false;
        this.botiquin = false;
        this.conos = false;
        this.medico = false;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean hasEntrenador() {
        return entrenador;
    }

    public void setEntrenador(boolean entrenador) {
        this.entrenador = entrenador;
    }

    public boolean hasPesas() {
        return pesas;
    }

    public void setPesas(boolean pesas) {
        this.pesas = pesas;
    }

    public boolean hasCauchos() {
        return cauchos;
    }

    public void setCauchos(boolean cauchos) {
        this.cauchos = cauchos;
    }

    public boolean hasBotiquin() {
        return botiquin;
    }

    public void setBotiquin(boolean botiquin) {
        this.botiquin = botiquin;
    }

    public boolean hasConos() {
        return conos;
    }

    public void setConos(boolean conos) {
        this.conos = conos;
    }

    public boolean hasMedico() {
        return medico;
    }

    public void setMedico(boolean medico) {
        this.medico = medico;
    }
}
