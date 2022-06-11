package tarea11.composicion;

public class Motor {

    private String cilingraje;

    private int cambios;

    public Motor(String cilingraje, int cambios) {
        this.cilingraje = cilingraje;
        this.cambios = cambios;
    }

    public String getCilingraje() {
        return cilingraje;
    }

    public void setCilingraje(String cilingraje) {
        this.cilingraje = cilingraje;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
}
