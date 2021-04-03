import java.util.ArrayList;
import java.util.List;

public class Contenido {
    public String nombre;
    public Genero genero;
    public Idioma idiomaOrigen;
    public int añoLanzamiento;
    public List<Actor> actores = new ArrayList<>();
    public List<Director> directores= new ArrayList<>();


    public Director buscarDirector(String nombre){
        for (Director director: this.directores){
            if(director.nombre.equals(nombre)){ 
            }
            
        }
        return null;
    }

}

    

