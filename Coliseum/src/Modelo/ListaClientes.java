package Modelo;

import java.util.Vector;

/**
 *
 * @author Alfonso
 */
public class ListaClientes {

    private Vector<Cliente> lista_clientes;

    public ListaClientes() {
        this.lista_clientes = new Vector<>();
    }

    public boolean agregarCliente(Cliente cliente) {
        for (Cliente cli:lista_clientes) {
            if (cli.getUsuario().equals(cliente.getUsuario())) {
                return false;
            }
        }
        lista_clientes.add(cliente);
        return true;
    }

    public void eliminarCliente(int id_cliente) {
        lista_clientes.removeIf(cli -> cli.getID() == id_cliente);
    }

    public boolean loginCliente(Cliente cliente) {
        for (Cliente cli : lista_clientes) {
            if (cliente.getUsuario().equals(cli.getUsuario())
                    && cliente.getContraseña().equals(cli.getContraseña())) {
                return true;
            }
        }
        return false;
    }

}
