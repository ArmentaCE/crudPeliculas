package vista;

import modelo.GestorPelicula;
import modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //Se inicializa el array de objetos de tipo de pelicula para hacer los métodos
        GestorPelicula gestionarPeliculas = new GestorPelicula();

        //Objetos de tipo película
        Pelicula pelicula1 = new Pelicula(0,"Interestellar",false);
        Pelicula pelicula2 = new Pelicula(1,"Rango", false);
        Pelicula pelicula3 = new Pelicula(2,"Sangre por Sangre",true);

        //Agrega los objetos a la lista
        gestionarPeliculas.AgregarPelicula(pelicula1);
        gestionarPeliculas.AgregarPelicula(pelicula2);
        gestionarPeliculas.AgregarPelicula(pelicula3);

        //gestionarPeliculas.ObtenerPeliculas();

        //Elimina la película según el Id
        //gestionarPeliculas.EliminarPelicula(0);

        //Obtiene todo el listado de películas
        //gestionarPeliculas.ObtenerPeliculas();

        //Obtiene las pelícuas disponibles
        //gestionarPeliculas.ObtenerPeliculasDisponibles();

        //Obtiene las películas no disponibles
        gestionarPeliculas.ObtenerPeliculasNoDisponibles();

        //Marca las película como disponible mediante el Id
        gestionarPeliculas.MarcarPeliculaComoDisponible(0);

        //gestionarPeliculas.ObtenerPeliculasNoDisponibles();
    }
}