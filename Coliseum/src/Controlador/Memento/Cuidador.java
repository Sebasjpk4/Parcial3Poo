package Controlador.Memento;

import java.util.ArrayList;
import java.util.List;

public class Cuidador {

    private List<MementoVenta> mementos = new ArrayList<>();

    public void agregarMemento(MementoVenta memento) {
        mementos.add(memento);
    }

    public MementoVenta obtenerMemento(int indice) {
        return mementos.get(indice);
    }
}
