import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.LabelUI;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public void inicializarCatalogo(){

       
        Pelicula titanic; 
        titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; 

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        titanic.actores.add(actor); 
        this.peliculas.add(titanic);

      
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la nohe";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;
        
        actor = new Actor(); 
        actor.nombre = "Christian Bale";
        batman.actores.add(actor);

        this.peliculas.add(batman);

        Pelicula LasHoras= new Pelicula();
        LasHoras.nombre= "Las Horas";

        LasHoras.añoLanzamiento= 2002;
        LasHoras.duracion= 142;

        actor= new Actor();
        actor.nombre="Nicole Kidman" ;
        LasHoras.actores.add(actor);

        this.peliculas.add(LasHoras);

        Pelicula VolverAlFuturo= new Pelicula();
        VolverAlFuturo.nombre= "Volver al Futuro";
        VolverAlFuturo.añoLanzamiento=1989;
        VolverAlFuturo.duracion=186;
        actor=new Actor();
        actor.nombre="Michael J Fox";
        VolverAlFuturo.actores.add(actor);
        this.peliculas.add(VolverAlFuturo);

        Serie dark= new Serie();
        dark.nombre = "Dark";
        dark.añoLanzamiento=2019;

        actor=new Actor();
        actor.nombre="Louis Hofmann";
        dark.actores.add (actor);

        actor=new Actor();
        actor.nombre="Oliver Masucci";
        dark.actores.add(actor);

        Temporada temporada= new Temporada();
        temporada.numero = 1;

        Episodio episodio= new Episodio();
        episodio.nombre= "Secretos";
        episodio.numero= 1;
        temporada.episodios.add(episodio);

        episodio= new Episodio();
        episodio.nombre="Mentiras";
        episodio.numero=2;
        temporada.episodios.add(episodio);

        episodio= new Episodio();
        episodio.nombre= "Pasado y Presente";
        episodio.numero=3;
        temporada.episodios.add(episodio);

        episodio= new Episodio();
        episodio.nombre="Dobles Vidas";
        episodio.numero=4;
        temporada.episodios.add(episodio);

        episodio= new Episodio();
        episodio.nombre="verdades";
        episodio.numero=5;
        temporada.episodios.add(episodio);

        dark.temporadas.add(temporada);
        
        temporada= new Temporada();
        temporada.numero=2;

        episodio= new Episodio();
        episodio.nombre="Principios y Finales";
        episodio.numero=1;
        temporada.episodios.add(episodio);

        episodio=new Episodio();
        episodio.nombre="Materia Oscura";
        episodio.numero=2;
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.numero=3;
        episodio.nombre="Fantasmas";
        temporada.episodios.add(episodio);

        episodio=new Episodio();
        episodio.nombre="Los Viajeros";
        episodio.numero=4;
        temporada.episodios.add(episodio);
        dark.temporadas.add(temporada);

        this.series.add(dark);
        

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;
        
        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";

        howIMetYM.actores.add(actor);
        
        Director director = new Director();
        director.nombre = "Pamela Fryman";
        director.cantidadPremios = 3;
        howIMetYM.directores.add(director);
        
        temporada= new Temporada();
        temporada.numero = 5;
     
        episodio = new Episodio();
        episodio.nombre = "The last cigarrette";
        episodio.numero = 11;

        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;

        temporada.episodios.add(episodio);
        howIMetYM.temporadas.add(temporada);

        temporada = new Temporada();
        temporada.numero = 3;
     
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Little Boys";
        episodio.numero = 4;

        temporada.episodios.add(episodio);

        howIMetYM.temporadas.add(temporada);

        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;
        
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";
        bbt.actores.add(actor);
        
        temporada = new Temporada();
        temporada.numero = 1;
    
        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;

        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "The Cooper-Hofstadter Polarizatio";

        temporada.episodios.add(episodio);
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

    }
    
    public Serie buscarSerie(String nombreABuscar){
        for (Serie serie : this.series) {
          
            if (serie.nombre.equals(nombreABuscar))
                return serie; 
        }
        return null;
    }

    public Pelicula buscarPelicula(String string) {
        return null;
    }
}

