package poo.model;

import java.util.ArrayList;
import java.util.List;

public class SerieTV extends ContenidoAudiovisual {
    private int numeroTemporadas;
    private List<Temporada> temporadas;

    public SerieTV(String id, String titulo, int duracionMinutos, String genero, int numeroTemporadas) {
        super(id, titulo, duracionMinutos, genero);
        this.numeroTemporadas = numeroTemporadas;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    public String obtenerDetalles() {
        return String.format("Serie: %s | Temporadas: %d | Género: %s",
                getTitulo(), numeroTemporadas, getGenero());
    }

    public int getNumeroTemporadas() { return numeroTemporadas; }
    public void setNumeroTemporadas(int numeroTemporadas) { this.numeroTemporadas = numeroTemporadas; }
    public List<Temporada> getTemporadas() { return temporadas; }
}