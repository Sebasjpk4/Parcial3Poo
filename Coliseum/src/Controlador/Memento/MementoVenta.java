/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Memento;

import Modelo.Cancha;
import Modelo.Cliente;

/**
 *
 * @author Sebas
 */
public class MementoVenta {
    private float valor;
    private int IDventa;
    private Cliente cliente;
    private String Datos;
    private Cancha cancha;  // Que cancha se reservo

    
    
    public MementoVenta(float valor, int IDventa, Cliente cliente, String Datos, Cancha cancha) {
        this.valor = valor;
        this.IDventa = IDventa;
        this.cliente = cliente;
        this.Datos = Datos;
        this.cancha = cancha;
    }

    public float getValor() {
        return valor;
    }

    public int getIDventa() {
        return IDventa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDatos() {
        return Datos;
    }

    public Cancha getCancha() {
        return cancha;
    }


    
}
