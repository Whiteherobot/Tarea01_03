package Partido;
 //@michi
public class Partido {
    private String lugarPartido;
    private String fechaPartido;
    private String integrantes;
    private Equipo equipo;
    private Jugador jugador;
    
    public Partido()
    {  
    }

    public Partido(String lugarPartido, String fechaPartido, String integrantes, Equipo equipo, Jugador jugador) {
        this.lugarPartido = lugarPartido;
        this.fechaPartido = fechaPartido;
        this.integrantes = integrantes;
        this.equipo = equipo;
        this.jugador = jugador;
    }

    public String getLugarPartido() {
        return lugarPartido;
    }

    public void setLugarPartido(String lugarPartido) {
        this.lugarPartido = lugarPartido;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partido{");
        sb.append("lugarPartido=").append(lugarPartido);
        sb.append(", fechaPartido=").append(fechaPartido);
        sb.append(", integrantes=").append(integrantes);
        sb.append(", equipo=").append(equipo);
        sb.append(", jugador=").append(jugador);
        sb.append('}');
        return sb.toString();
    }
   

  
}


