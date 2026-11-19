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

public class BardoTest {

    @Test
    public void probarBardo() {
        Bardo bardo = new Bardo("Orfeo", 3, 65, "Laúd");

        assertEquals("Orfeo", bardo.getNombre());
        assertEquals(3, bardo.getNivel());
        assertEquals(65, bardo.getPuntosVida());
    }

    @Test
    public void probarCombateBardo() {
        Bardo bardo = new Bardo("Orfeo", 3, 65, "Laúd");

        assertTrue(bardo.ejecutarCombate().contains("Inspiración Bárdica"));
    }
}
