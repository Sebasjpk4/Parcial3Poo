package Controlador;

import Modelo.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Sebas
 */
public class Datos {

    public static boolean IngresarNuevo(Cliente C) {
        File User = new File("User.txt");

        if (!User.exists()) {
            return false;
        }

        try {
            PrintWriter addUser = new PrintWriter(new FileWriter(User, true));
            addUser.println(C.toString());
            addUser.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}


