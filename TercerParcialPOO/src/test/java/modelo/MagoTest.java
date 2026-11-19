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

public class MagoTest {

    @Test
    public void probarMago() {
        Mago mago = new Mago("Merlin", 5, 80, 3);

        assertEquals("Merlin", mago.getNombre());
        assertEquals(5, mago.getNivel());
        assertEquals(80, mago.getPuntosVida());
    }

    @Test
    public void probarCombateMago() {
        Mago mago = new Mago("Merlin", 5, 80, 3);

        assertTrue(mago.ejecutarCombate().contains("Bola de Fuego"));
    }
}
