/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_01;


import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class Ventana02_GL extends JFrame{
    JPanel jpanel;
    ArrayList<JLabel> jlabelList;

    public Ventana02_GL(String titulo, int ancho, int alto, int posX, int posY)  {
        jpanel = new JPanel();
        jlabelList = new ArrayList<>();
        this.setTitle(titulo);
        this.setSize(ancho, alto);
        this.setLocation(posX, posY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanel);
        iniciarComponentes();
        configurarLayout();
    }
    
    private void iniciarComponentes(){
        for (int i = 0; i < 5; i++) {
            jlabelList.add(new JLabel("label"+(i+1)));
            jpanel.add(jlabelList.get(i));
        }
    }
    
    private void configurarLayout(){
        jpanel.setLayout(new GridLayout(3,2 ));
    }
    
    
}
