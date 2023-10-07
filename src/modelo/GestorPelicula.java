package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPelicula{

    List<Object> ColeccionPeliculas = new ArrayList<>();

    public void AgregarPelicula(Pelicula pelicula){
        ColeccionPeliculas.add(pelicula);
        //System.out.println(ColeccionPeliculas);
    }

}
