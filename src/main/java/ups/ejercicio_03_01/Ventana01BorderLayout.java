/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_01;

import java.awt.BorderLayout;

/**
 *
 * @author diego
 */
public class Ventana01BorderLayout extends Ventana{

    public Ventana01BorderLayout(String titulo, int ancho, int alto, int posX, int posY) {
        super(titulo, ancho, alto, posX, posY);
    }

    @Override
    protected void iniciarComponentesVentana() {
        super.iniciarComponentesVentana(); 
    }

    @Override
    protected void configurarLayout() {
        this.jpanelPrincipal.setLayout(new BorderLayout());
        this.jpanelPrincipal.add(this.jpanelList.get(0),BorderLayout.NORTH);
        this.jpanelPrincipal.add(this.jpanelList.get(1),BorderLayout.EAST);
        this.jpanelPrincipal.add(this.jpanelList.get(2),BorderLayout.CENTER);
        this.jpanelPrincipal.add(this.jpanelList.get(3),BorderLayout.WEST);
        this.jpanelPrincipal.add(this.jpanelList.get(4),BorderLayout.SOUTH);
    }

    
   
    
}
