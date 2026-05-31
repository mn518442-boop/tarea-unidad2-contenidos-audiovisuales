package poo.model;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String id, String titulo, int duracionMinutos, String genero, String tema, Investigador investigador) {
        super(id, titulo, duracionMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    @Override
    public String obtenerDetalles() {
        return String.format("Documental: %s | Tema: %s | Investigador: %s",
                getTitulo(), tema, investigador.getNombreCompleto());
    }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }
    public Investigador getInvestigador() { return investigador; }
    public void setInvestigador(Investigador investigador) { this.investigador = investigador; }
}