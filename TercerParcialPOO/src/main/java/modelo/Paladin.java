/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Valentina
 */
public class Paladin extends Aventurero {

    private int puntosFuerza;

    public Paladin(String nombre, int nivel, int puntosVida, int puntosFuerza) {
        super(nombre, nivel, puntosVida);
        this.puntosFuerza = puntosFuerza;
    }

    public int getPuntosFuerza() {
        return puntosFuerza;
    }

    public void setPuntosFuerza(int puntosFuerza) {
        this.puntosFuerza = puntosFuerza;
    }

    @Override
    public String ejecutarCombate() {
        return "El Paladín " + nombre
                + " consume magia para imbuir su arma con un "
                + "Castigo Divino de daño radiante.";
    }
}

