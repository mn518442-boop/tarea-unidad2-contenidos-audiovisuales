package uni1a;

/**
 * Subclase VideoYouTube que hereda de ContenidoAudiovisual
 */
public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;
    private int vistas;
    private String url;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, String url) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.vistas = 0;
        this.url = url;
    }

    // Getters y Setters
    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        if (vistas >= 0) {
            this.vistas = vistas;
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Método propio
    public void incrementarVistas(int cantidad) {
        if (cantidad > 0) {
            this.vistas += cantidad;
            System.out.println("Vistas actualizadas: " + this.vistas);
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Canal: " + canal);
        System.out.println("Vistas: " + vistas);
        System.out.println("URL: " + url);
        System.out.println("-------------------------------");
    }
}