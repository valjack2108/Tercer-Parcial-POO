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

public class PaladinTest {

    @Test
    public void probarPaladin() {
        Paladin paladin = new Paladin("Arthur", 6, 110, 5);

        assertEquals("Arthur", paladin.getNombre());
        assertEquals(6, paladin.getNivel());
        assertEquals(110, paladin.getPuntosVida());
    }

    @Test
    public void probarCombatePaladin() {
        Paladin paladin = new Paladin("Arthur", 6, 110, 5);

        assertTrue(paladin.ejecutarCombate().contains("Castigo Divino"));
    }
}
