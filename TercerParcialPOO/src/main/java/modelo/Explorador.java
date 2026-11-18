/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Valentina
 */
public class Explorador extends Aventurero {

    private String terrenoFavorecido;

    public Explorador(String nombre, int nivel, int puntosVida,
                      String terrenoFavorecido) {
        super(nombre, nivel, puntosVida);
        this.terrenoFavorecido = terrenoFavorecido;
    }

    public String getTerrenoFavorecido() {
        return terrenoFavorecido;
    }

    public void setTerrenoFavorecido(String terrenoFavorecido) {
        this.terrenoFavorecido = terrenoFavorecido;
    }

    @Override
    public String ejecutarCombate() {
        return "El Explorador " + nombre
                + " aplica Marca del Cazador sobre el objetivo "
                + "para maximizar su daño sostenido.";
    }
}

