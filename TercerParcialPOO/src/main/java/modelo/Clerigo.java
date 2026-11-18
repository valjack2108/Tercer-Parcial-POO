/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Valentina
 */
public class Clerigo extends Aventurero {

    private String diosVenerado;

    public Clerigo(String nombre, int nivel, int puntosVida,
                   String diosVenerado) {

        super(nombre, nivel, puntosVida);
        this.diosVenerado = diosVenerado;
    }

    public String getDiosVenerado() {
        return diosVenerado;
    }

    public void setDiosVenerado(String diosVenerado) {
        this.diosVenerado = diosVenerado;
    }

    @Override
    public String ejecutarCombate() {
        return "El Clérigo " + nombre
                + " usa Canalizar Divinidad para curar a sus aliados "
                + "y expulsar muertos vivientes.";
    }
}

