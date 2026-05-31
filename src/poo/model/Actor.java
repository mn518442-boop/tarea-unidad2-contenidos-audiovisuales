package poo.model;

public class Actor {
    private String id;
    private String nombreCompleto;
    private String nacionalidad;
    private int anoNacimiento;

    public Actor(String id, String nombreCompleto, String nacionalidad, int anoNacimiento) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.nacionalidad = nacionalidad;
        this.anoNacimiento = anoNacimiento;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public int getAnoNacimiento() { return anoNacimiento; }
    public void setAnoNacimiento(int anoNacimiento) { this.anoNacimiento = anoNacimiento; }
}