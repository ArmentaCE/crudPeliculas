package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {

    /////////Lista de peliculas/////////
    private List<Pelicula> Peliculas;

    /////////////Métodos///////////////
    public GestorPelicula(){
        Peliculas = new ArrayList<>();
    }

    public void AgregarPelicula(Pelicula pelicula){
        Peliculas.add(pelicula);
    }

    public void EliminarPelicula(int Id){
        System.out.println("***** Se eliminó el elemento con el Id " + Id + " *****\n");
        Peliculas.remove(Id);
    }

    public void ObtenerPeliculas(){
        System.out.println("***** Listado de Películas *****");
        for(Pelicula pelicula : Peliculas){
            System.out.println(pelicula.getNombre());
        }
        System.out.println("\n");
    }

    public void ObtenerPeliculasDisponibles(){
        System.out.println("***** Películas Disponibles *****");
        for(Pelicula pelicula : Peliculas){
            if (pelicula.isDisponible()){
                System.out.println(pelicula.getNombre());
            }
        }
    }

    public void ObtenerPeliculasNoDisponibles(){
        System.out.println("***** Peliculas no Disponibles *****");
        for(Pelicula pelicula : Peliculas){
            if (!pelicula.isDisponible()){
                System.out.println("ID:" + pelicula.getId() + " Título: " + pelicula.getNombre());
            }
        }
    }

    public void MarcarPeliculaComoDisponible(int Id){
        Peliculas.get(Id).setDisponible(true);
    }

}
