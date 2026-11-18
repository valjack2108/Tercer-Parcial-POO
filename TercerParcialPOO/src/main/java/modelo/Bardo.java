/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Valentina
 */
public class Bardo extends Aventurero {

    private String instrumentoMusical;

    public Bardo(String nombre, int nivel, int puntosVida,
                 String instrumentoMusical) {
        super(nombre, nivel, puntosVida);
        this.instrumentoMusical = instrumentoMusical;
    }

    public String getInstrumentoMusical() {
        return instrumentoMusical;
    }

    public void setInstrumentoMusical(String instrumentoMusical) {
        this.instrumentoMusical = instrumentoMusical;
    }

    @Override
    public String ejecutarCombate() {
        return "El Bardo " + nombre
                + " toca su instrumento para otorgar Inspiración "
                + "Bárdica a un aliado.";
    }
}

