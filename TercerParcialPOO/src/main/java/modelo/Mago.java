/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Valentina
 */
public class Mago extends Aventurero {

    private int espaciosConjuro;

    public Mago(String nombre, int nivel, int puntosVida,
                int espaciosConjuro) {

        super(nombre, nivel, puntosVida);
        this.espaciosConjuro = espaciosConjuro;
    }

    public int getEspaciosConjuro() {
        return espaciosConjuro;
    }

    public void setEspaciosConjuro(int espaciosConjuro) {
        this.espaciosConjuro = espaciosConjuro;
    }

    @Override
    public String ejecutarCombate() {
        return "El Mago " + nombre
                + " gasta un espacio de conjuro para lanzar "
                + "una poderosa Bola de Fuego.";
    }
}
