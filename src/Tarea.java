public class Tarea {

    private String descripcion;
    private boolean completada;

    public Tarea (String descripcion, boolean completada){
        this.descripcion=descripcion;
        this.completada=completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
