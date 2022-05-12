/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_01;



import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class Ventana extends JFrame{
   private JPanel mainJPanel;
   private final ArrayList<JPanel> jpanelList;
   private final ArrayList<JLabel> jlabelList;

    public Ventana(String titulo, int ancho, int alto) {
        this.mainJPanel = new JPanel();
        this.jlabelList = new ArrayList<>();
        this.jpanelList = new ArrayList<>();
        configurarVentana(titulo, ancho, alto);
        
    }
    
    public final void configurarVentana(String titulo, int ancho, int alto){
        this.setTitle(titulo);
        this.setSize(ancho, alto);
        // Posicion en el centro de la pantalla
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.mainJPanel);
        this.mainJPanel.setLayout(new BorderLayout(5,0));
        
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        
        
        this.jpanelList.get(0).add(new JLabel("label1"));
        this.jpanelList.get(1).add(new JLabel("label2"));
        this.jpanelList.get(2).add(new JLabel("label3"));
        this.jpanelList.get(3).add(new JLabel("label4"));
        this.jpanelList.get(4).add(new JLabel("label5"));
        
        this.mainJPanel.add(jpanelList.get(0),BorderLayout.NORTH);
        this.mainJPanel.add(jpanelList.get(1),BorderLayout.EAST);
        this.mainJPanel.add(jpanelList.get(2),BorderLayout.CENTER);
        this.mainJPanel.add(jpanelList.get(3),BorderLayout.WEST);
        this.mainJPanel.add(jpanelList.get(4),BorderLayout.SOUTH);
        
    }
    
   
    
    
    
   
   
}
