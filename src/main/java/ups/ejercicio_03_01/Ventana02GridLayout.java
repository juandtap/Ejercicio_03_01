/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_01;

import java.awt.GridLayout;

/**
 *
 * @author diego
 */
public class Ventana02GridLayout extends Ventana{

    public Ventana02GridLayout(String titulo, int ancho, int alto, int posX, int posY) {
        super(titulo, ancho, alto, posX, posY);
    }

    @Override
    protected void iniciarComponentesVentana() {
        super.iniciarComponentesVentana(); 
    }

    @Override
    protected void configurarLayout() {
        this.jpanelPrincipal.setLayout(new GridLayout(3,2 ));
        for (int i = 0; i < 5; i++) {
            jpanelPrincipal.add(jpanelList.get(i));
        }
    }
    
    
}
