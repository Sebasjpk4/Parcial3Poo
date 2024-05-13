package Modelo;

public class Cliente {
    private String Contraseña;
    private String Nombre;
    private int ID;

    public Cliente() {
    }

    public Cliente(String Contraseña, String Nombre, int ID) {
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   
}
