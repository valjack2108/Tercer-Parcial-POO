/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Valentina
 */
import modelo.Aventurero;
import persistencia.RegistroGremio;
import java.util.ArrayList;
import java.util.List;

public class ControladorAventureros {

    private ArrayList<Aventurero> aventureros;
    private RegistroGremio registro;

    public ControladorAventureros() {
        aventureros = new ArrayList<>();
        registro = new RegistroGremio();
    }

    public void registrarAventurero(Aventurero aventurero) {
        aventureros.add(aventurero);

        registro.guardarRegistro(
                aventurero.toString()
        );
    }

    public List<Aventurero> listarAventureros() {
        return aventureros;
    }

    public String simularCombate(String nombre) {

        for (Aventurero aventurero : aventureros) {

            if (aventurero.getNombre().equalsIgnoreCase(nombre)) {

                String resultado = aventurero.ejecutarCombate();

                registro.guardarCombate(resultado);

                return resultado;
            }
        }

        return "No se encontró un aventurero con ese nombre.";
    }
}

