package vista;

import modelo.GestorPelicula;
import modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        GestorPelicula gestionarPeliculas = new GestorPelicula();

        Pelicula pelicula1 = new Pelicula(0,"Interestellar",true);
        Pelicula pelicula2 = new Pelicula(1,"Rango", true);

        gestionarPeliculas.AgregarPelicula(pelicula1);
        gestionarPeliculas.AgregarPelicula(pelicula2);

        //gestionarPeliculas.EliminarPelicula(0);

        gestionarPeliculas.ObtenerPeliculas();

    }
}