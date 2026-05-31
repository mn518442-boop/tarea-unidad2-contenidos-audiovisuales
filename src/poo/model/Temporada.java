package poo.model;

public class Temporada {
    private int numero;
    private int cantidadEpisodios;
    private int anoLanzamiento;

    public Temporada(int numero, int cantidadEpisodios, int anoLanzamiento) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
        this.anoLanzamiento = anoLanzamiento;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public int getCantidadEpisodios() { return cantidadEpisodios; }
    public void setCantidadEpisodios(int cantidadEpisodios) { this.cantidadEpisodios = cantidadEpisodios; }
    public int getAnoLanzamiento() { return anoLanzamiento; }
    public void setAnoLanzamiento(int anoLanzamiento) { this.anoLanzamiento = anoLanzamiento; }
}
