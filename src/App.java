public class App {
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        //How I met your mother y 
        //reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("Dark");

        Temporada temporada = serieBuscada.buscarTemporada(2);

        Episodio episodio = temporada.buscarEpisodio(4);

        episodio.reproducir();

        Contenido miContenido = new Contenido();
  
        Director director = miContenido.buscarDirector(null);

        System.out.println("El director buscado es: " + director);


    }
}

