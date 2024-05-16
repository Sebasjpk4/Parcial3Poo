package Controlador;

public class Singleton {

    private static Singleton instance;  // Cambiar nombre por el nombre de la variable a usar

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
