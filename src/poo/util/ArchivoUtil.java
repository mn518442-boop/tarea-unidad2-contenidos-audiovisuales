package poo.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoUtil {

   
    public List<String> leerArchivo(String ruta) {
        List<String> lineas = new ArrayList<>();
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("⚠️ Archivo no encontrado: " + ruta);
            return lineas;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (!linea.isBlank()) { 
                    lineas.add(linea.trim());
                }
            }
        } catch (IOException e) {
            System.err.println("❌ Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }

    
    public boolean escribirArchivo(String ruta, List<String> datos) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta))) {
            for (String linea : datos) {
                escritor.write(linea);
                escritor.newLine();
            }
            System.out.println("✅ Datos guardados correctamente en: " + ruta);
            return true;
        } catch (IOException e) {
            System.err.println("❌ Error al guardar el archivo: " + e.getMessage());
            return false;
        }
    }
}