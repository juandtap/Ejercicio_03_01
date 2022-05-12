/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.ejercicio_03_01;

/**
 *
 * @author diego
 */
public class Ejercicio_03_01 {

    public static void main(String[] args) {
        var ventana1 = new Ventana("ventana1", 400, 100);
        ventana1.setVisible(true);
        var ventananoruega = new VentanaNoruega("bandera noruega");
        ventananoruega.setVisible(true);
    }
}
