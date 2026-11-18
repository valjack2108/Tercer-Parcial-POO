/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Valentina
 */
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegistroGremio {

    private final String archivo = "registro_gremio.txt";

    public void guardarRegistro(String informacion) {
        guardarEnArchivo("REGISTRO: " + informacion);
    }

    public void guardarCombate(String informacion) {
        guardarEnArchivo("COMBATE: " + informacion);
    }

    private void guardarEnArchivo(String informacion) {

        try (FileWriter escritor = new FileWriter(archivo, true)) {

            escritor.write(LocalDateTime.now() + " - "
                    + informacion + System.lineSeparator());

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: "
                    + e.getMessage());
        }
    }
}

