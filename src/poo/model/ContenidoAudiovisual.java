package poo.model;

public abstract class ContenidoAudiovisual {
    private String id;
    private String titulo;
    private int duracionMinutos;
    private String genero;

    public ContenidoAudiovisual(String id, String titulo, int duracionMinutos, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public abstract String obtenerDetalles();
}