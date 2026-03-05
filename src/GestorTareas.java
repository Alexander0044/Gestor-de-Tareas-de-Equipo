import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void mostrarTareas() {

        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        for (int i = 0; i < tareas.size(); i++) {
            Tarea t = tareas.get(i);
            System.out.println((i + 1) + ". " + t.getDescripcion());
        }
    }

    public void añadirTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }
}