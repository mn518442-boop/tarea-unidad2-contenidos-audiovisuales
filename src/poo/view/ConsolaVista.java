package poo.view;

import java.util.List;
import java.util.Scanner;
import poo.model.ContenidoAudiovisual;

public class ConsolaVista {
    // Herramienta para leer datos del teclado
    private final Scanner entrada = new Scanner(System.in);

    // Muestra el menú principal
    public void mostrarMenuPrincipal() {
        System.out.println("\n=====================================");
        System.out.println("   SISTEMA DE CONTENIDOS AUDIOVISUALES   ");
        System.out.println("=====================================");
        System.out.println("1. Ver todos los contenidos");
        System.out.println("2. Cargar datos desde archivo CSV");
        System.out.println("3. Guardar datos en archivo CSV");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Muestra la lista completa de contenidos
    public void mostrarListaContenidos(List<ContenidoAudiovisual> lista) {
        if (lista.isEmpty()) {
            System.out.println("⚠️ No hay contenidos registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE CONTENIDOS ---");
        for (ContenidoAudiovisual contenido : lista) {
            System.out.println(contenido.obtenerDetalles());
        }
    }

    // Lee la opción elegida por el usuario
    public int leerOpcion() {
        while (!entrada.hasNextInt()) {
            System.out.print("❌ Por favor ingrese un NÚMERO válido: ");
            entrada.next();
        }
        return entrada.nextInt();
    }

    // Muestra mensajes generales al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println("💬 " + mensaje);
    }
}
