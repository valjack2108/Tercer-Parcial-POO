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

public class MonjeTest {

    @Test
    public void probarMonje() {
        Monje monje = new Monje("Kai", 3, 75, 4);

        assertEquals("Kai", monje.getNombre());
        assertEquals(3, monje.getNivel());
        assertEquals(75, monje.getPuntosVida());
    }

    @Test
    public void probarCombateMonje() {
        Monje monje = new Monje("Kai", 3, 75, 4);

        assertTrue(monje.ejecutarCombate().contains("Ráfaga de Golpes"));
    }
}

