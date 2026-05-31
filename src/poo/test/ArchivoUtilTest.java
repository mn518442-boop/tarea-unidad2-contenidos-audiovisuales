package poo.test;

import org.junit.jupiter.api.Test;
import poo.util.ArchivoUtil;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ArchivoUtilTest {

    @Test
    void testLeerArchivoExiste() {
        ArchivoUtil util = new ArchivoUtil();
        List<String> datos = util.leerArchivo("contenidos_audiovisuales.csv");
        assertEquals(3, datos.size(), "Debería haber 3 líneas leídas");
    }

    @Test
    void testLeerArchivoNoExiste() {
        ArchivoUtil util = new ArchivoUtil();
        List<String> datos = util.leerArchivo("archivo_inexistente.csv");
        assertTrue(datos.isEmpty(), "La lista debe estar vacía");
    }
}