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
        //System.out.println(Peliculas);
    }

    public void EliminarPelicula(int Id){
        System.out.println("Se eliminó el elemento con el Id " + Id);
        Peliculas.remove(Id);
    }

    public void ObtenerPeliculas(){
        System.out.println("Listado de Pelicas");
        System.out.println(Peliculas);
    }

    public void ObtenerPeliculasDisponibles(){
        System.out.println(Peliculas);
    }

    public void ObtenerPeliculasNoDisponibles(){

    }

    public void MarcarPeliculaComoDisponible(int Id){

    }

}
