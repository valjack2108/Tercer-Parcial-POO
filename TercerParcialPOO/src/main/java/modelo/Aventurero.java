/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Valentina
 */
public abstract class Aventurero implements IAccionCombate {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public Aventurero(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public Aventurero(String nombre, int nivel) {
        this(nombre, nivel, 10);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public abstract String ejecutarCombate();

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "Nivel: " + nivel
                + "Puntos de vida: " + puntosVida;
    }
}
