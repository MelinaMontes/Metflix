public class App {
    public static void main(String[] args) throws Exception {
       

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();

        Serie serieBuscada = miMetflix.buscarSerie("Dark");

        Temporada temporada = serieBuscada.buscarTemporada(2);

        Episodio episodio = temporada.buscarEpisodio(4);

        episodio.reproducir();

        Contenido miContenido = new Contenido();
  
        Director director = miContenido.buscarDirector(null);

        System.out.println("El director buscado es: " + director);


    }
}

