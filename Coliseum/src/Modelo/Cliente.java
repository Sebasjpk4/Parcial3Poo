package Modelo;

public class Cliente {
    private String usuario;
    private String Contraseña;
    private String Nombre;
    private int ID;

    public Cliente() {
    }

    public Cliente(String usuario, String Contraseña, String Nombre, int ID) {
        this.usuario = usuario;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
