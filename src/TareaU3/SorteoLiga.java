package TareaU3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SorteoLiga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("--- Universidad Politécnica Salesiana ---");
        System.out.println("Sorteo de Equipos para Liga Profesional");
        System.out.print("Ingrese la etapa (octavos, cuartos, semifinales): ");
        String etapa = sc.nextLine();

       
        int numEquipos = 0;
        if (etapa.equalsIgnoreCase("octavos")) numEquipos = 16;
        else if (etapa.equalsIgnoreCase("cuartos")) numEquipos = 8;
        else if (etapa.equalsIgnoreCase("semifinales")) numEquipos = 4;
        else {
            System.out.println("Etapa no reconocida.");
            return;
        }

       
        List<String> equipos = new ArrayList<>();
        for (int i = 0; i < numEquipos; i++) {
            System.out.print("Nombre del equipo " + (i + 1) + ": ");
            equipos.add(sc.nextLine());
        }

        
        Collections.shuffle(equipos);

        System.out.println("\n--- RESULTADO DEL SORTEO (" + etapa.toUpperCase() + ") ---");
       
        realizarSorteoRecursivo(equipos, 1);
    }

    /**
     * Método que utiliza recursividad para emparejar equipos [cite: 32]
     */
    public static void realizarSorteoRecursivo(List<String> lista, int partidoNum) {
        // Caso base: Si quedan menos de 2 equipos, ya no hay más partidos que armar
        if (lista.size() < 2) {
            return;
        }

        // Tomar los dos primeros equipos (ya están en orden aleatorio)
        String equipo1 = lista.get(0);
        String equipo2 = lista.get(1);

        // Mostrar el enfrentamiento [cite: 36]
        System.out.println("Partido " + partidoNum + ": " + equipo1 + " vs " + equipo2);

        // Crear sublista con los equipos que aún no han jugado
        List<String> restantes = new ArrayList<>(lista.subList(2, lista.size()));

        // Llamada recursiva con la lista reducida 
        realizarSorteoRecursivo(restantes, partidoNum + 1);
    }
}