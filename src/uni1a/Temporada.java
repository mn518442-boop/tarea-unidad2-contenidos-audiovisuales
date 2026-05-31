package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Temporada - Relacionada con SerieDeTV (Composición)
 */
public class Temporada {

    private int numero;
    private int numeroEpisodios;
    private String fechaEstreno;
    private List<String> episodios;

    // Constructor
    public Temporada(int numero, int numeroEpisodios, String fechaEstreno) {
        this.numero = numero;
        this.numeroEpisodios = numeroEpisodios;
        this.fechaEstreno = fechaEstreno;
        this.episodios = new ArrayList<>();
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void agregarEpisodio(String nombreEpisodio) {
        if (nombreEpisodio != null && !nombreEpisodio.isEmpty()) {
            this.episodios.add(nombreEpisodio);
        }
    }

    public List<String> getEpisodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "Temporada " + numero + " (" + numeroEpisodios + " episodios) - Estreno: " + fechaEstreno;
    }
}