package poo.controller;

import java.util.ArrayList;
import java.util.List;
import poo.model.ContenidoAudiovisual;
import poo.model.Pelicula;
import poo.util.ArchivoUtil;
import poo.view.ConsolaVista;

public class ContenidoController {
    // Almacena todos los contenidos en memoria
    private final List<ContenidoAudiovisual> listaContenidos;
    // Conexión con la vista
    private final ConsolaVista vista;
    // Conexión con la utilidad de archivos
    private final ArchivoUtil gestorArchivos;
    // Ruta donde se guardará/cargará el archivo CSV
    private static final String RUTA_ARCHIVO = "contenidos_audiovisuales.csv";

    // Constructor: inicia todo lo necesario
    public ContenidoController(ConsolaVista vista, ArchivoUtil gestorArchivos) {
        this.listaContenidos = new ArrayList<>();
        this.vista = vista;
        this.gestorArchivos = gestorArchivos;
    }

    // Método principal: hace funcionar todo el sistema
    public void ejecutarSistema() {
        boolean activo = true;

        while (activo) {
            vista.mostrarMenuPrincipal();
            int opcion = vista.leerOpcion();

            switch (opcion) {
                case 1 -> verContenidos();
                case 2 -> cargarDatosDeArchivo();
                case 3 -> guardarDatosEnArchivo();
                case 4 -> {
                    vista.mostrarMensaje("Saliendo del sistema... ¡Hasta luego!");
                    activo = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    // Opción 1: Mostrar lo que hay guardado
    private void verContenidos() {
        vista.mostrarListaContenidos(listaContenidos);
    }

    // Opción 2: Leer el archivo CSV y cargar los datos a la lista
    private void cargarDatosDeArchivo() {
        List<String> lineasLeidas = gestorArchivos.leerArchivo(RUTA_ARCHIVO);
        listaContenidos.clear(); // Limpiamos lo que había antes

        for (String linea : lineasLeidas) {
            String[] datos = linea.split(","); // Separamos por comas

            // Verificamos qué tipo de contenido es (empezamos con Películas)
            if ("PEL".equals(datos[0])) {
                Pelicula pelicula = new Pelicula(
                    datos[1],       // ID
                    datos[2],       // Título
                    Integer.parseInt(datos[3]), // Duración
                    datos[4],       // Género
                    datos[5],       // Director
                    Integer.parseInt(datos[6])  // Año
                );
                listaContenidos.add(pelicula);
            }
            // Aquí luego agregaremos: if ("SER".equals... para Series, etc.
        }
        vista.mostrarMensaje("Datos cargados. Total: " + listaContenidos.size());
    }

    // Opción 3: Guardar todo lo de la lista en el archivo CSV
    private void guardarDatosEnArchivo() {
        List<String> datosAGuardar = new ArrayList<>();

        for (ContenidoAudiovisual contenido : listaContenidos) {
            if (contenido instanceof Pelicula p) {
                String lineaCSV = String.format("PEL,%s,%s,%d,%s,%s,%d",
                    p.getId(), p.getTitulo(), p.getDuracionMinutos(),
                    p.getGenero(), p.getDirector(), p.getAnoEstreno()
                );
                datosAGuardar.add(lineaCSV);
            }
        }

        boolean exito = gestorArchivos.escribirArchivo(RUTA_ARCHIVO, datosAGuardar);
        if (exito) {
            vista.mostrarMensaje("Guardado correctamente.");
        } else {
            vista.mostrarMensaje("Error al guardar.");
        }
    }
}