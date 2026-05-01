package uni1a;

/**
 * Clase Main para probar todas las funcionalidades del proyecto
 */
public class PruebaContenidoAudiovisual {

    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE CONTENIDOS AUDIOVISUALES ===\n");

        // 1. Crear una Película con Actores
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        pelicula.agregarActor(new Actor("Leonardo DiCaprio", "Estados Unidos", 48));
        pelicula.agregarActor(new Actor("Joseph Gordon-Levitt", "Estados Unidos", 42));
        
        // 2. Crear una Serie con Temporadas
        SerieDeTV serie = new SerieDeTV("The Office", 22, "Comedia", 9);
        Temporada temp1 = new Temporada(1, 6, "2005");
        Temporada temp2 = new Temporada(2, 22, "2006");
        temp1.agregarEpisodio("Pilot");
        temp2.agregarEpisodio("The Dundies");
        serie.agregarTemporada(temp1);
        serie.agregarTemporada(temp2);

        // 3. Crear un Documental con Investigadores
        Documental documental = new Documental("Planet Earth", 60, "Documental", "Naturaleza");
        documental.agregarInvestigador(new Investigador("David Attenborough", "Biología", "BBC"));
        documental.agregarInvestigador(new Investigador("Sigourney Weaver", "Narración", "National Geographic"));

        // 4. Crear un Cortometraje
        Cortometraje corto = new Cortometraje("The Silent Child", 20, "Drama", "Oscar 2018");
        corto.marcarComoPremiado();

        // 5. Crear un Video de YouTube
        VideoYouTube videoYT = new VideoYouTube("¿Cómo funciona la gravedad?", 15, "Educativo", 
                                               "Vsauce", "https://youtube.com/watch?v=abc123");

        // Mostrar todos los detalles
        System.out.println("--- PELÍCULA ---");
        pelicula.mostrarDetalles();

        System.out.println("--- SERIE DE TV ---");
        serie.mostrarDetalles();

        System.out.println("--- DOCUMENTAL ---");
        documental.mostrarDetalles();

        System.out.println("--- CORTOMETRAJE ---");
        corto.mostrarDetalles();

        System.out.println("--- VIDEO YOUTUBE ---");
        videoYT.mostrarDetalles();

        System.out.println("=== FIN DE LA PRUEBA ===");
    }
}