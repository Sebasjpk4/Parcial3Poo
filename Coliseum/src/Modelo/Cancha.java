package Modelo;

public class Cancha {

    private int Cantidad;
    private float valor;
    private String Nombre;
    private String Adicionales[] = new String[6]; // Entrenador personal, Pesas, Cauchos, Medkit, Conos, Medicos, Escalera, ARRAYLIST

    public Cancha(int Cantidad, float valor, String Nombre) {
        this.Cantidad = Cantidad;
        this.valor = valor;
        this.Nombre = Nombre;
        Adicionales[0] = "Entreandor personal";
        Adicionales[1] = "Pesas";
        Adicionales[2] = "Cauchos";
        Adicionales[3] = "Medkit Basico";
        Adicionales[4] = "Conos";
        Adicionales[5] = "Medicos";
        Adicionales[6] = "Escalera";
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String[] getAdicionales() {
        return Adicionales;
    }

    public void setAdicionales(String[] Adicionales) {
        this.Adicionales = Adicionales;
    }
    
    

}
