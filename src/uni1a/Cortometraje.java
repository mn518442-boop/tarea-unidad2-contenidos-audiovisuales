package uni1a;

/**
 * Subclase Cortometraje que hereda de ContenidoAudiovisual
 */
public class Cortometraje extends ContenidoAudiovisual {

    private String festival;
    private boolean premiado;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String festival) {
        super(titulo, duracionEnMinutos, genero);
        this.festival = festival;
        this.premiado = false;
    }

    // Getters y Setters
    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public boolean isPremiado() {
        return premiado;
    }

    public void setPremiado(boolean premiado) {
        this.premiado = premiado;
    }

    // Método propio
    public void marcarComoPremiado() {
        this.premiado = true;
        System.out.println("¡El cortometraje '" + getTitulo() + "' ha sido marcado como premiado!");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Festival: " + festival);
        System.out.println("Premiado: " + (premiado ? "Sí" : "No"));
        System.out.println("-------------------------------");
    }
}