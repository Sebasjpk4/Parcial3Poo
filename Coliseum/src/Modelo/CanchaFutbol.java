package Modelo;
public class CanchaFutbol extends Cancha{

    private int AdicionalesEspeciales []; // Balon de futbol, 

    public CanchaFutbol(int[] AdicionalesEspeciales, int Cantidad, float valor, String Nombre) {
        super(Cantidad, valor, Nombre);
        this.AdicionalesEspeciales = AdicionalesEspeciales;
    }

    
    
}