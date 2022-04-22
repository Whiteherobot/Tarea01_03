package Partido;
// @author Gabriela
public class Principal_1 {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setNombre("Daniel Radcliffe");
        actor.setPaisOrigen("Reino Unido");
        actor.setYearNacimiento(1989);
        
        System.out.println("El nombre del actor es: " + actor.getNombre());
        System.out.println("El pais de origen del actor es: " + actor.getPaisOrigen());
        System.out.println("El pais de origen del actor es: " + actor.getYearNacimiento());
        
        Personaje personaje = new Personaje();
        personaje.setNombrePersonaje("Harry Potter");
        personaje.setTipoPersonaje("Mago");
        personaje.setCualidadPersonaje("Perseverante");
        
        
        System.out.println("El nombre del personaje es: " + personaje.getNombrePersonaje());
        System.out.println("El personaje es : " + personaje.getTipoPersonaje());
        System.out.println("La cualidad que destaca del personaje es: " + personaje.getCualidadPersonaje());
        
        Pelicula pelicula = new Pelicula();
        pelicula.setCategoria("Novela Fantastica");
        pelicula.setNombrePelicula("Harry Potter");
        pelicula.setYearPelicula(2001);
        
        System.out.println("La categoria de la pelicula es: " + pelicula.getCategoria());
        System.out.println("El nombre de la pelicula : " + pelicula.getNombrePelicula());
        System.out.println("El año de la pelicula es: " + pelicula.getYearPelicula());
        
    }
}
