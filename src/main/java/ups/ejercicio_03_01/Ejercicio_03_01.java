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
        
        
        var ventananoruega = new VentanaNoruega("Bandera Noruega", 500, 220, 500,200 );
        ventananoruega.setVisible(true);
        
        var ventanaBL = new Ventana01BorderLayout("Border Layout", 400, 120, 0, 0);
        ventanaBL.setVisible(true);
        
        var ventanaGL = new Ventana02GridLayout("Grid Layout", 220, 150, 450, 0);
        ventanaGL.setVisible(true);
        
        var ventanaFL = new Ventana03FlowLayout("Flow Layout", 400, 100, 700, 0);
        ventanaFL.setVisible(true);
    }
}
