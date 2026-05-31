package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Subclase Pelicula que extiende de ContenidoAudiovisual
 */
public class Pelicula extends ContenidoAudiovisual {

    private String estudio;
    private List<Actor> actores;   // Relación de Agregación con Actor

    // Constructor
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);   // Llamada correcta al constructor padre
        this.estudio = estudio;
        this.actores = new ArrayList<>();           // Inicializamos la lista
    }

    // Getter y Setter del estudio
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    // ====================== RELACIÓN CON ACTOR ======================

    /**
     * Agrega un actor a la película
     */
    public void agregarActor(Actor actor) {
        if (actor != null && !actores.contains(actor)) {
            this.actores.add(actor);
        }
    }

    public List<Actor> getActores() {
        return actores;
    }

    /**
     * Muestra los actores de la película
     */
    public void mostrarActores() {
        System.out.println("Actores de la película '" + getTitulo() + "':");
        if (actores.isEmpty()) {
            System.out.println("  No hay actores registrados.");
        } else {
            for (Actor actor : actores) {
                System.out.println("  - " + actor);
            }
        }
    }

    // Sobrescribimos mostrarDetalles para incluir la información completa
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();     // Muestra título, duración, género, id, etc.
        System.out.println("Estudio: " + estudio);
        mostrarActores();
        System.out.println("-------------------------------");
    }
}