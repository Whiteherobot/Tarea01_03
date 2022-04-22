package Partido;
 // @author Gabriela
public class Actor {
    public String nombre;
    public int yearNacimiento;
    public String paisOrigen;
    public Pelicula datosPelicula;
    public Personaje datosPersonaje; 

    public Actor(){
    }
    public Actor(String nombre, int yearNacimiento, String paisOrigen, Pelicula datosPelicula, Personaje datosPersonaje) {
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
        this.paisOrigen = paisOrigen;
        this.datosPelicula = datosPelicula;
        this.datosPersonaje = datosPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Pelicula getDatosPelicula() {
        return datosPelicula;
    }

    public void setDatosPelicula(Pelicula datosPelicula) {
        this.datosPelicula = datosPelicula;
    }

    public Personaje getDatosPersonaje() {
        return datosPersonaje;
    }

    public void setDatosPersonaje(Personaje datosPersonaje) {
        this.datosPersonaje = datosPersonaje;
    }
    
}
