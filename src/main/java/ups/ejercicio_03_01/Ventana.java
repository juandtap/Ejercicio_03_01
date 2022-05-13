/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_01;



import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public abstract class Ventana extends JFrame{
   
    protected final JPanel jpanelPrincipal;
    protected final ArrayList<JPanel> jpanelList;
    protected final ArrayList<JLabel> jlabelList;

    public Ventana(String titulo, int ancho, int alto, int posX, int posY){
        
        this.jpanelPrincipal = new JPanel();
        this.jpanelList = new ArrayList<>();
        this.jlabelList = new ArrayList<>();
        this.setTitle(titulo);
        this.setSize(ancho, alto);
        this.setLocation(posX, posY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanelPrincipal);
        iniciarComponentesVentana();
        configurarLayout();
    }
    
    protected void iniciarComponentesVentana(){
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
    
    protected void configurarLayout(){
        
    }
    
    
}
