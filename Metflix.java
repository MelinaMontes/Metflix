import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.LabelUI;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    
    //Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo(){

        //Pelis: Titanic, Batman: El caballero de la noche 
        Pelicula titanic; //declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); //Estas ultimoas 2 lineas: Pelicula titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; //3hs 30

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        //Agrego a la lista de actores del objeto titanic
        titanic.actores.add(actor); //metodo Add -> agregar a una lista

        //Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        //Otra Peli
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la nohe";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;

        //No voy a declarar otra variable actor, voy a reusar
        //siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); //Creo un nuevo actor, pero referenciado con la variable actor
        actor.nombre = "Christian Bale";

        batman.actores.add(actor);

        this.peliculas.add(batman);

        //**** TAREA **** CARGAR PELICULAS

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

        
                     //DARK//

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
        




   //How I met your mother. Serie
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
        
        //T5:E11
        //creo la temporada
        temporada= new Temporada();
        temporada.numero = 5;
     
        //Creo el episodio
         episodio = new Episodio();
        episodio.nombre = "The last cigarrette";
        episodio.numero = 11;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);


        //T3
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 3;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Little Boys";
        episodio.numero = 4;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        //Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.

        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;
        
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";

        bbt.actores.add(actor);

        
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 1;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "The Cooper-Hofstadter Polarizatio";

        temporada.episodios.add(episodio);

        //Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

    }
    
    //Buscar Serie
    public Serie buscarSerie(String nombreABuscar){

        // series = | serie1 | serie2 | serie25 | serie40 |
        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, qeu apunta en cada vuelta
        //a cada elemento de la lista
        //o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        //serie25 hasta que termina.
        for (Serie serie : this.series) {
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))
                return serie; //devuelvo esta serie.
        }
        //si llego hasta aca, es porque no encontro la serie.
        return null;

    }

    public Pelicula buscarPelicula(String string) {
        return null;
    }


   
    //buscar un director
    //
}

