package poo.model;

public class Pelicula extends ContenidoAudiovisual {
    private String director;
    private int anoEstreno;

    public Pelicula(String id, String titulo, int duracionMinutos, String genero, String director, int anoEstreno) {
        super(id, titulo, duracionMinutos, genero);
        this.director = director;
        this.anoEstreno = anoEstreno;
    }

    @Override
    public String obtenerDetalles() {
        return String.format("Película: %s | Director: %s | Año: %d | Género: %s",
                getTitulo(), director, anoEstreno, getGenero());
    }

    // Getters y Setters
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
    public int getAnoEstreno() { return anoEstreno; }
    public void setAnoEstreno(int anoEstreno) { this.anoEstreno = anoEstreno; }
}