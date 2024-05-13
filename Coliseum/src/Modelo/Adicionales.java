package Modelo;

public class Adicionales {
private int cantidad;
private float valor;
private String Nombre;

    public Adicionales(int cantidad, float valor, String Nombre) {
        this.cantidad = cantidad;
        this.valor = valor;
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
    
}
