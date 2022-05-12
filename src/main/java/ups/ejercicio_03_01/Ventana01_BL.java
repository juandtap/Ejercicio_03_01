/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class Ventana01_BL extends JFrame{

    private final JPanel jpanelPrincipal;
    private final ArrayList<JPanel> jpanelList;
    private final ArrayList<JLabel> jlabelList;

    public Ventana01_BL(String titulo, int ancho, int alto, int posX, int posY) {
        jpanelPrincipal = new JPanel();
        jpanelList = new ArrayList<>();
        jlabelList = new ArrayList<>();
        this.setTitle(titulo);
        this.setSize(ancho, alto);
        this.setLocation(posX, posY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanelPrincipal);
        iniciarComponentesVentana();
        configurarLayout();
        
    }
    
    private void iniciarComponentesVentana(){
        
        // 5 jpanels y jlabels
        for (int i = 0; i < 5; i++) {
            jpanelList.add(new JPanel());
            jlabelList.add(new JLabel("label "+(i+1)));
        }
        
        // agrego las labels a los jpanels
        for (int i = 0; i < 5; i++) {
            jpanelList.get(i).add(jlabelList.get(i));           
        }
    }
    
    private void configurarLayout(){
        jpanelPrincipal.setLayout(new BorderLayout());
        this.jpanelPrincipal.add(jpanelList.get(0),BorderLayout.NORTH);
        this.jpanelPrincipal.add(jpanelList.get(1),BorderLayout.EAST);
        this.jpanelPrincipal.add(jpanelList.get(2),BorderLayout.CENTER);
        this.jpanelPrincipal.add(jpanelList.get(3),BorderLayout.WEST);
        this.jpanelPrincipal.add(jpanelList.get(4),BorderLayout.SOUTH);
        
        
    }
    
    
    
}
