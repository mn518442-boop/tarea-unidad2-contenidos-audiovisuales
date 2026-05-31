package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Subclase Documental que extiende de ContenidoAudiovisual
 */
public class Documental extends ContenidoAudiovisual {

    private String tema;
    private List<Investigador> investigadores;   // Relación de Agregación con Investigador

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();   // Inicializamos la lista
    }

    // Getter y Setter del tema
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // ====================== RELACIÓN CON INVESTIGADOR ======================

    /**
     * Agrega un investigador al documental
     */
    public void agregarInvestigador(Investigador investigador) {
        if (investigador != null && !investigadores.contains(investigador)) {
            this.investigadores.add(investigador);
        }
    }

    public List<Investigador> getInvestigadores() {
        return investigadores;
    }

    /**
     * Muestra los investigadores del documental
     */
    public void mostrarInvestigadores() {
        System.out.println("Investigadores del documental '" + getTitulo() + "':");
        if (investigadores.isEmpty()) {
            System.out.println("  No hay investigadores registrados.");
        } else {
            for (Investigador inv : investigadores) {
                System.out.println("  - " + inv);
            }
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tema: " + tema);
        mostrarInvestigadores();
        System.out.println("-------------------------------");
    }
}