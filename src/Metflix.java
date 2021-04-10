import java.util.ArrayList;
import java.util.List;

import personas.*;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public void inicializarCatalogo() {

        // CATALOGO DE PELICULAS

        Pelicula titanic;
        titanic = new Pelicula();

        titanic.setNombre("Titanic");
        titanic.setAñoLanzamiento(1997);
        titanic.setDuracion(210);

        Actor actor = new Actor();
        actor.setNombre("Leo DiCaprio");

        // Agrego a la lista de actores del objeto titanic
        titanic.getActores().add(actor); // metodo Add -> agregar a una lista
        // Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        Pelicula batman = new Pelicula();
        batman.setNombre("Batman: el caballero de la noche");
        batman.setAñoLanzamiento(2008);
        batman.setDuracion(152);
        // re instanciar
        actor = new Actor(); // Creo un nuevo actor, pero referenciado con la variable actor
        actor.setNombre("Christian Bale");

        batman.getActores().add(actor);

        this.peliculas.add(batman);

        Pelicula LasHoras = new Pelicula();
        LasHoras.setNombre("Las Horas");

        LasHoras.setAñoLanzamiento(2002);
        LasHoras.setDuracion(142);

        actor = new Actor();
        actor.setNombre("Nicole Kidman");
        LasHoras.getActores().add(actor);

        this.peliculas.add(LasHoras);

        Pelicula elResplandor = new Pelicula();
        elResplandor.setNombre("El Resplandor");
        elResplandor.setDirector(new Director());
        elResplandor.getDirector().setNombre("Stanley Kubrick");
        this.peliculas.add(elResplandor);

        Pelicula VolverAlFuturo = new Pelicula();
        VolverAlFuturo.setNombre("Volver al Futuro");
        VolverAlFuturo.setAñoLanzamiento(1989);
        VolverAlFuturo.setDuracion(186);

        actor = new Actor();
        actor.setNombre("Michael J Fox");
        VolverAlFuturo.getActores().add(actor);

        this.peliculas.add(VolverAlFuturo);

        // SERIES

        Serie dark = new Serie();
        dark.setNombre("Dark");
        dark.setAñoLanzamiento(2019);

        actor = new Actor();
        actor.setNombre("Louis Hofmann");
        dark.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Oliver Masucci");
        dark.getActores().add(actor);

        Temporada temporada = new Temporada();
        temporada.setNumero(1);

        Episodio episodio = new Episodio(1, "Secretos");
        // episodio.nombre = "Secretos";
        // episodio.numero = 1;
        episodio.setDuracion(43);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(2, "Mentiras");
        // episodio.nombre = "Mentiras";
        // episodio.numero = 2;

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(3, "Pasado y Presente");

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(4, "Dobles Vidas");

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(5, "Verdades");

        temporada.getEpisodios().add(episodio);

        dark.getTemporadas().add(temporada);

        temporada = new Temporada();
        temporada.setNumero(2);

        episodio = new Episodio(1, "Principios y Finales");
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(2, "Materia Oscura");
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(3, "Fantasmas");
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(4, "Los Viajeros");
        temporada.getEpisodios().add(episodio);

        dark.getTemporadas().add(temporada);

        this.series.add(dark);

        Serie howIMetYM = new Serie();
        howIMetYM.setNombre("How I met your mother");
        howIMetYM.setAñoLanzamiento(2005);

        actor = new Actor();
        actor.setNombre("Neil Patrick Harris");

        howIMetYM.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Cobie Smulders");

        howIMetYM.getActores().add(actor);

        temporada = new Temporada();
        temporada.setNumero(5);

        episodio = new Episodio(11, "The last cigarrette");
        episodio.setDuracion(43);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(1, "Definitions", 41);

        temporada.getEpisodios().add(episodio);

        Websodio ws = new Websodio(35, "Nombre wesodio en internet", "http://miepisodios.com/websodio.avi");
        // ws.setNombre("Nombre wesodio en internet");
        // ws.setNumero(35);
        ws.setDuracion(42);
        // ws.setLink("http://miepisodios.com/websodio.avi");

        temporada.getEpisodios().add(ws);

        howIMetYM.getTemporadas().add(temporada);

        temporada = new Temporada();
        temporada.setNumero(3);

        episodio = new Episodio(1, "Wait for it", 40);
        // episodio.setNombre("Wait for it");
        // episodio.setNumero(1);
        // episodio.setDuracion(40);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(4, "Little Boys");
        // episodio.setNombre("Little Boys");
        // episodio.setNumero(4);
        episodio.setDuracion(44);

        temporada.getEpisodios().add(episodio);

        howIMetYM.getTemporadas().add(temporada);

        this.series.add(howIMetYM);
        Serie bbt = new Serie();
        bbt.setNombre("The BigBang Theory");
        bbt.setAñoLanzamiento(2007);

        actor = new Actor();
        actor.setNombre("Kaley Cuoco");

        bbt.getActores().add(actor);

        temporada = new Temporada();
        temporada.setNumero(1);

        episodio = new Episodio(1, "Pilot", 41);

        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(13, "The Cooper-Hofstadter Polarization");

        temporada.getEpisodios().add(episodio);

        bbt.getTemporadas().add(temporada);

        this.series.add(bbt);

    }

    // Buscar Serie
    public Serie buscarSerie(String nombreABuscar) {

        for (Serie serie : this.series) {

            if (serie.getNombre().equals(nombreABuscar))
                return serie;
        }
        return null;

    }
}
