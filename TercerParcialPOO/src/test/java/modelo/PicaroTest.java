/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Valentina
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExploradorTest {

    @Test
    public void probarExplorador() {
        Explorador explorador = new Explorador("Robin", 4, 85, "Bosque");

        assertEquals("Robin", explorador.getNombre());
        assertEquals(4, explorador.getNivel());
        assertEquals(85, explorador.getPuntosVida());
    }

    @Test
    public void probarCombateExplorador() {
        Explorador explorador = new Explorador("Robin", 4, 85, "Bosque");

        assertTrue(explorador.ejecutarCombate().contains("Marca del Cazador"));
    }
}
