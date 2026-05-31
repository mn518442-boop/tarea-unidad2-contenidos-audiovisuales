package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Subclase SerieDeTV que extiende de ContenidoAudiovisual
 */
public class SerieDeTV extends ContenidoAudiovisual {

    private int numeroTemporadas;
    private List<Temporada> temporadas;   // Relación de Composición con Temporada

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numeroTemporadas = numeroTemporadas;
        this.temporadas = new ArrayList<>();   // Inicializamos la lista
    }

    // Getter y Setter
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    // ====================== RELACIÓN CON TEMPORADA ======================

    /**
     * Agrega una temporada a la serie
     */
    public void agregarTemporada(Temporada temporada) {
        if (temporada != null) {
            this.temporadas.add(temporada);
        }
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    /**
     * Muestra las temporadas de la serie
     */
    public void mostrarTemporadas() {
        System.out.println("Temporadas de la serie '" + getTitulo() + "':");
        if (temporadas.isEmpty()) {
            System.out.println("  No hay temporadas registradas.");
        } else {
            for (Temporada temp : temporadas) {
                System.out.println("  - " + temp);
            }
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de temporadas: " + numeroTemporadas);
        mostrarTemporadas();
        System.out.println("-------------------------------");
    }
}