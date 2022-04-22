package Partido;
// @author Gabriela
public class Pelicula {
    public String categoria;
    public String nombrePelicula;
    public int yearPelicula;
    public Actor actor;

    public Pelicula(){
    }
    public Pelicula(String categoria, String nombrePelicula, int yearPelicula) {
        this.categoria = categoria;
        this.nombrePelicula = nombrePelicula;
        this.yearPelicula = yearPelicula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getYearPelicula() {
        return yearPelicula;
    }

    public void setYearPelicula(int yearPelicula) {
        this.yearPelicula = yearPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "categoria=" + categoria + ", nombrePelicula=" + nombrePelicula + ", yearPelicula=" + yearPelicula + '}';
    }
}
