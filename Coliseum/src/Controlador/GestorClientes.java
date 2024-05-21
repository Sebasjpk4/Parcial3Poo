package Controlador;

import Modelo.Cliente;
import Modelo.ListaClientes;
import Vista.LoginFrame;

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
    
    public static GestorClientes getInstance(){
        return instance;
    }

    public static GestorClientes getInstance(ListaClientes clientes, LoginFrame vista) {
        if (instance == null) {
            instance = new GestorClientes(clientes, vista);
        }
        return instance;
    }

    public boolean registrarCliente() {
        Cliente cliente = vista.registrarCliente();
        if (clientes.existeUsuario(cliente)) {
            vista.mostrarRegistrado();
            return false;
        }
        clientes.agregarCliente(cliente);
        vista.ocultarAvisos();
        return true;
    }

    public boolean loginCliente() {
        Cliente cliente = vista.ingresoCliente();
        if (clientes.existeUsuario(cliente)) {
            if (clientes.loginCliente(cliente)) {
                vista.ocultarAvisos();
                return true;
            } else {
                vista.mostrarContraseñaIncorrecta();
                return false;
            }
        }
        vista.mostrarNoRegistrado();
        return false;
    }
}
