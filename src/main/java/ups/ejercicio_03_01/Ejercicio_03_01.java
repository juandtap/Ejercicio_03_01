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
        //var ventana1 = new Ventana("ventana1", 400, 100);
        //ventana1.setVisible(true);
        //var ventananoruega = new VentanaNoruega("bandera noruega");
        //ventananoruega.setVisible(true);
        var ventanaBorderLayout = new Ventana01_BL("Border Layout", 400, 100, 0, 0);
        ventanaBorderLayout.setVisible(true);
        
        var ventanaGridLayout = new Ventana02_GL("Grid Layout", 200, 150, 450, 0);
        ventanaGridLayout.setVisible(true);
        
        var ventanaFlowLayout = new Ventana03_FL("Flow Layout", 400, 100, 700, 0);
        ventanaFlowLayout.setVisible(true);
    }
}
