package Partido;
// @author Gabriela
public class Personaje {
    public String nombrePersonaje;
    public String tipoPersonaje;
    public String cualidadPersonaje;
    public Actor actor;

    public Personaje(){
    }
    public Personaje(String nombrePersonaje, String tipoPersonaje, String cualidadPersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.tipoPersonaje = tipoPersonaje;
        this.cualidadPersonaje = cualidadPersonaje;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public String getCualidadPersonaje() {
        return cualidadPersonaje;
    }

    public void setCualidadPersonaje(String cualidadPersonaje) {
        this.cualidadPersonaje = cualidadPersonaje;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombrePersonaje=" + nombrePersonaje + ", tipoPersonaje=" + tipoPersonaje + ", cualidadPersonaje=" + cualidadPersonaje + '}';
    }


}
