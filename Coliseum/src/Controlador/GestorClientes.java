package Controlador;

import Modelo.Cliente;
import Modelo.ListaClientes;
import Vista.LoginFrame;
import javax.swing.JFrame;

/**
 *
 * @author Alfonso
 */
public class GestorClientes {

    private static GestorClientes instance;
    private static ListaClientes clientes;
    private static LoginFrame vista;

    private GestorClientes(ListaClientes clientes, LoginFrame vista) {
        GestorClientes.clientes = clientes;
        GestorClientes.vista = vista;
    }

    public static GestorClientes getInstance(ListaClientes clientes, LoginFrame vista) {
        if (instance == null) {
            instance = new GestorClientes(clientes, vista);
        }
        return instance;
    }

    public boolean registrarCliente() {
        Cliente cliente = vista.registrarCliente();
        return clientes.agregarCliente(cliente);
    }

    public boolean loginCliente() {
        Cliente cliente = vista.ingresoCliente();
        return clientes.loginCliente(cliente);
    }
}