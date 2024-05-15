package Controlador.Memento;

import Modelo.Cancha;
import Modelo.Cliente;
import java.util.List;

public class Venta {

    private float valor;
    private int IDventa;
    private Cliente cliente;
    private String Datos;
    private Cancha cancha;  // Que cancha se reservo
    
    
    ///
    ///     OE FALTA LOS ADICIONALES QUE NO SE COMO LOS TRABAJASTE TU 
    ///

    public Venta(float valor, int IDventa, Cliente cliente, String Datos, Cancha cancha) {
        this.valor = valor;
        this.IDventa = IDventa;
        this.cliente = cliente;
        this.Datos = Datos;
        this.cancha = cancha;
    }

    public Venta() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIDventa() {
        return IDventa;
    }

    public void setIDventa(int IDventa) {
        this.IDventa = IDventa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDatos() {
        return Datos;
    }

    public void setDatos(String Datos) {
        this.Datos = Datos;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public MementoVenta guardar() {
        return new MementoVenta(this.valor, this.IDventa, this.cliente, this.Datos, this.cancha);
    }

    public void restaurar(MementoVenta memento) {
        this.valor = memento.getValor(); 
        this.IDventa=memento.getIDventa();
        this.cliente = memento.getCliente(); 
        this.Datos= memento.getDatos(); 
        this.cancha= memento.getCancha(); 
    }

}
