package Partido;
 //@michi
public class Principal {
    public static void main(String[] args) {
        var jugador = new Jugador();
        jugador.setNombreEquipo("PapitasCrew");
        jugador.setNumerosJugadores(12);
        jugador.setPatrocinador("MichiCorp");
        System.out.println("El nombre del equipo es: " + jugador.getNombreEquipo());
        System.out.println("El numero de jugadores que reprenta al equipo es: " + jugador.getNumerosJugadores());
        System.out.println("El patrocinador de este partido es :"  + jugador.getPatrocinador());        
        var persona = new Partido();
        persona.setLugarPartido("Ecuador");
        persona.setFechaPartido("Mañana 9:00 pm");
        persona.setIntegrantes("......\n"+
                               "Hugo.\n" +
                               "Martín.\n" +
                               "Lucas.\n" +
                               "Mateo.\n" +
                               "Leo.\n" +
                               "Daniel.\n" +
                               "Alejandro.\n" +
                               "Pablo.");
        
        System.out.println("El lugar del patido sera en: " + persona.getLugarPartido());
        System.out.println("La fecha del partido sera el: " + persona.getFechaPartido());
        System.out.println("Los integrantes del partido son:" + persona.getIntegrantes());
        var equipo = new Equipo();
        equipo.setFaltasJugador(3);
        equipo.setJugadorLesionado(0);
        System.out.println("las faltas que comete el equipo de papitas son: " + equipo.getFaltasJugador());
        System.out.println("El numero de jugadores lesionados en este partido son: " + equipo.getJugadorLesionado());
        

        
        
    }
}