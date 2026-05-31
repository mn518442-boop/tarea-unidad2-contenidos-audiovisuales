package poo.test;

import org.junit.jupiter.api.Test;
import poo.model.Pelicula;
import static org.junit.jupiter.api.Assertions.*;

class PeliculaTest {

    @Test
    void testCrearPeliculaYDetalles() {
        Pelicula pelicula = new Pelicula(
                "PEL999", "Prueba Eclipse", 120, "Prueba", "Yo Mismo", 2026
        );

        assertEquals("PEL999", pelicula.getId());
        assertEquals("Prueba Eclipse", pelicula.getTitulo());
        assertEquals(120, pelicula.getDuracionMinutos());
        assertEquals("Yo Mismo", pelicula.getDirector());

        String detalles = pelicula.obtenerDetalles();
        assertTrue(detalles.contains("Prueba Eclipse"));
    }
}