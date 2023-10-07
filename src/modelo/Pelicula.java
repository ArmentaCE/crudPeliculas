package modelo;

public class Pelicula extends GestorPelicula {

    public Pelicula(int id, String nombre, boolean disponible) {
        Id = id;
        Nombre = nombre;
        Disponible = disponible;
    }

    private int Id;
    private String Nombre;
    private boolean Disponible;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Disponible=" + Disponible +
                '}';
    }
}
