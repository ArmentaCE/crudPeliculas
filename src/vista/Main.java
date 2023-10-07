package vista;

import modelo.GestorPelicula;
import modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Pelicula pelicula1 = new Pelicula(1,"Interestellar", true);
        //Pelicula pelicula2 = new Pelicula(2,"Rango", true);

        pelicula1.AgregarPelicula(pelicula1);

        //List<Object>ColeccionPeliculas = new ArrayList<>();

    }
}