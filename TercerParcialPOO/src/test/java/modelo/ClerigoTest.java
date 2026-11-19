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

public class ClerigoTest {

    @Test
    public void probarClerigo() {
        Clerigo clerigo = new Clerigo("Luna", 4, 90, "Selune");

        assertEquals("Luna", clerigo.getNombre());
        assertEquals(4, clerigo.getNivel());
        assertEquals(90, clerigo.getPuntosVida());
    }

    @Test
    public void probarCombateClerigo() {
        Clerigo clerigo = new Clerigo("Luna", 4, 90, "Selune");

        assertTrue(clerigo.ejecutarCombate().contains("Canalizar Divinidad"));
    }
}

