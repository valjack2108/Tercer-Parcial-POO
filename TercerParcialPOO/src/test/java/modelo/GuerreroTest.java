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
import modelo.Guerrero;

public class GuerreroTest {

    @Test
    public void probarNombreGuerrero() {
        Guerrero guerrero = new Guerrero(
            "Arthas", 5, 100, true
        );

        assertEquals("Arthas", guerrero.getNombre());
    }

    @Test
    public void probarNivelGuerrero() {
        Guerrero guerrero = new Guerrero(
            "Arthas", 5, 100, true
        );

        assertEquals(5, guerrero.getNivel());
    }

    @Test
    public void probarPuntosVidaGuerrero() {
        Guerrero guerrero = new Guerrero(
            "Arthas", 5, 100, true
        );

        assertEquals(100, guerrero.getPuntosVida());
    }

    @Test
    public void probarCombateGuerrero() {
        Guerrero guerrero = new Guerrero(
            "Arthas", 5, 100, true
        );

        assertTrue(
            guerrero.ejecutarCombate().contains("Oleada de Acción")
        );
    }
}

