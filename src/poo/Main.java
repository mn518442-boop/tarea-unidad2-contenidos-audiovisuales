package poo;

import poo.controller.ContenidoController;
import poo.util.ArchivoUtil;
import poo.view.ConsolaVista;

public class Main {
    public static void main(String[] args) {
        // Creamos las partes del sistema
        ConsolaVista vista = new ConsolaVista();
        ArchivoUtil utilArchivos = new ArchivoUtil();
        
        // Conectamos todo en el controlador
        ContenidoController controlador = new ContenidoController(vista, utilArchivos);
        
        // ¡Iniciamos el programa!
        controlador.ejecutarSistema();
    }
}