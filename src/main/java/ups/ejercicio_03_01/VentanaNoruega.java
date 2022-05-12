/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_01;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC-1
 */
public class VentanaNoruega extends JFrame{
    private final ArrayList<JPanel> jpanelList;

    public VentanaNoruega(String title) {
        this.setTitle(title);
        this.jpanelList = new ArrayList<>();
        this.setSize(600, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        jpanelList.add(new JPanel()); //panel principal
        
        for (int i = 0; i < 240; i++) {
            jpanelList.add(new JPanel());
        }
         
        this.setContentPane(jpanelList.get(0));
        jpanelList.get(0).setLayout(new GridLayout(12,20));
        // fila 1
        jpanelList.get(1).setBackground(Color.RED);
        jpanelList.get(2).setBackground(Color.RED);
        jpanelList.get(3).setBackground(Color.RED);
        jpanelList.get(4).setBackground(Color.RED);
        jpanelList.get(5).setBackground(Color.WHITE);
        jpanelList.get(6).setBackground(Color.BLUE);
        jpanelList.get(7).setBackground(Color.BLUE);
        jpanelList.get(8).setBackground(Color.WHITE);
        jpanelList.get(9).setBackground(Color.RED);
        jpanelList.get(10).setBackground(Color.RED);
        jpanelList.get(11).setBackground(Color.RED);
        jpanelList.get(12).setBackground(Color.RED);
        jpanelList.get(13).setBackground(Color.RED);
        jpanelList.get(14).setBackground(Color.RED);
        jpanelList.get(15).setBackground(Color.RED);
        jpanelList.get(16).setBackground(Color.RED);
        jpanelList.get(17).setBackground(Color.RED);
        jpanelList.get(18).setBackground(Color.RED);
        jpanelList.get(19).setBackground(Color.RED);
        jpanelList.get(20).setBackground(Color.RED);
         // fila 2
        jpanelList.get(21).setBackground(Color.RED);
        jpanelList.get(22).setBackground(Color.RED);
        jpanelList.get(23).setBackground(Color.RED);
        jpanelList.get(24).setBackground(Color.RED);
        jpanelList.get(25).setBackground(Color.WHITE);
        jpanelList.get(26).setBackground(Color.BLUE);
        jpanelList.get(27).setBackground(Color.BLUE);
        jpanelList.get(28).setBackground(Color.WHITE);
        jpanelList.get(29).setBackground(Color.RED);
        jpanelList.get(30).setBackground(Color.RED);
        jpanelList.get(31).setBackground(Color.RED);
        jpanelList.get(32).setBackground(Color.RED);
        jpanelList.get(33).setBackground(Color.RED);
        jpanelList.get(34).setBackground(Color.RED);
        jpanelList.get(35).setBackground(Color.RED);
        jpanelList.get(36).setBackground(Color.RED);
        jpanelList.get(37).setBackground(Color.RED);
        jpanelList.get(38).setBackground(Color.RED);
        jpanelList.get(39).setBackground(Color.RED);
        jpanelList.get(40).setBackground(Color.RED);
        
         // fila 3
        jpanelList.get(41).setBackground(Color.RED);
        jpanelList.get(42).setBackground(Color.RED);
        jpanelList.get(43).setBackground(Color.RED);
        jpanelList.get(44).setBackground(Color.RED);
       jpanelList.get(45).setBackground(Color.WHITE);
        jpanelList.get(46).setBackground(Color.BLUE);
        jpanelList.get(47).setBackground(Color.BLUE);
        jpanelList.get(48).setBackground(Color.WHITE);
        jpanelList.get(49).setBackground(Color.RED);
        jpanelList.get(50).setBackground(Color.RED);
        jpanelList.get(51).setBackground(Color.RED);
        jpanelList.get(52).setBackground(Color.RED);
        jpanelList.get(53).setBackground(Color.RED);
        jpanelList.get(54).setBackground(Color.RED);
        jpanelList.get(55).setBackground(Color.RED);
        jpanelList.get(56).setBackground(Color.RED);
        jpanelList.get(57).setBackground(Color.RED);
        jpanelList.get(58).setBackground(Color.RED);
        jpanelList.get(59).setBackground(Color.RED);
        jpanelList.get(60).setBackground(Color.RED);
        
         // fila 4
        jpanelList.get(61).setBackground(Color.RED);
        jpanelList.get(62).setBackground(Color.RED);
        jpanelList.get(63).setBackground(Color.RED);
        jpanelList.get(64).setBackground(Color.RED);
        jpanelList.get(65).setBackground(Color.WHITE);
        jpanelList.get(66).setBackground(Color.BLUE);
        jpanelList.get(67).setBackground(Color.BLUE);
        jpanelList.get(68).setBackground(Color.WHITE);
        jpanelList.get(69).setBackground(Color.RED);
        jpanelList.get(70).setBackground(Color.RED);
        jpanelList.get(71).setBackground(Color.RED);
        jpanelList.get(72).setBackground(Color.RED);
        jpanelList.get(73).setBackground(Color.RED);
        jpanelList.get(74).setBackground(Color.RED);
        jpanelList.get(75).setBackground(Color.RED);
        jpanelList.get(76).setBackground(Color.RED);
        jpanelList.get(77).setBackground(Color.RED);
        jpanelList.get(78).setBackground(Color.RED);
        jpanelList.get(79).setBackground(Color.RED);
        jpanelList.get(80).setBackground(Color.RED);
        
        // fila 5 franja blacna azul
        jpanelList.get(81).setBackground(Color.WHITE);
        jpanelList.get(82).setBackground(Color.WHITE);
        jpanelList.get(83).setBackground(Color.WHITE);
        jpanelList.get(84).setBackground(Color.WHITE);
        jpanelList.get(85).setBackground(Color.WHITE);
        jpanelList.get(86).setBackground(Color.BLUE);
        jpanelList.get(87).setBackground(Color.BLUE);
        jpanelList.get(88).setBackground(Color.WHITE);
        jpanelList.get(89).setBackground(Color.WHITE);
        jpanelList.get(90).setBackground(Color.WHITE);
        jpanelList.get(91).setBackground(Color.WHITE);
        jpanelList.get(92).setBackground(Color.WHITE);
        jpanelList.get(93).setBackground(Color.WHITE);
        jpanelList.get(94).setBackground(Color.WHITE);
        jpanelList.get(95).setBackground(Color.WHITE);
        jpanelList.get(96).setBackground(Color.WHITE);
        jpanelList.get(97).setBackground(Color.WHITE);
        jpanelList.get(98).setBackground(Color.WHITE);
        jpanelList.get(99).setBackground(Color.WHITE);
        jpanelList.get(100).setBackground(Color.WHITE);
        
        // fila 6 Y 7  todo azul 
        //PANEL  101 a 140
        for (int i = 101; i <= 140; i++) {
            jpanelList.get(i).setBackground(Color.BLUE);
        }
      
        // fila 8
        
        jpanelList.get(141).setBackground(Color.WHITE);
        jpanelList.get(142).setBackground(Color.WHITE);
        jpanelList.get(143).setBackground(Color.WHITE);
        jpanelList.get(144).setBackground(Color.WHITE);
        jpanelList.get(145).setBackground(Color.WHITE);
        jpanelList.get(146).setBackground(Color.BLUE);
        jpanelList.get(147).setBackground(Color.BLUE);
        jpanelList.get(148).setBackground(Color.WHITE);
        jpanelList.get(149).setBackground(Color.WHITE);
        jpanelList.get(150).setBackground(Color.WHITE);
        jpanelList.get(151).setBackground(Color.WHITE);
        jpanelList.get(152).setBackground(Color.WHITE);
        jpanelList.get(153).setBackground(Color.WHITE);
        jpanelList.get(154).setBackground(Color.WHITE);
        jpanelList.get(155).setBackground(Color.WHITE);
        jpanelList.get(156).setBackground(Color.WHITE);
        jpanelList.get(157).setBackground(Color.WHITE);
        jpanelList.get(158).setBackground(Color.WHITE);
        jpanelList.get(159).setBackground(Color.WHITE);
         jpanelList.get(160).setBackground(Color.WHITE);
        
        /// filas 9 a 12 
        jpanelList.get(161).setBackground(Color.RED);
        jpanelList.get(162).setBackground(Color.RED);
        jpanelList.get(163).setBackground(Color.RED);
        jpanelList.get(164).setBackground(Color.RED);
        jpanelList.get(165).setBackground(Color.WHITE);
        jpanelList.get(166).setBackground(Color.BLUE);
        jpanelList.get(167).setBackground(Color.BLUE);
        jpanelList.get(168).setBackground(Color.WHITE);
        jpanelList.get(169).setBackground(Color.RED);
        jpanelList.get(170).setBackground(Color.RED);
        jpanelList.get(171).setBackground(Color.RED);
        jpanelList.get(172).setBackground(Color.RED);
        jpanelList.get(173).setBackground(Color.RED);
        jpanelList.get(174).setBackground(Color.RED);
        jpanelList.get(175).setBackground(Color.RED);
        jpanelList.get(176).setBackground(Color.RED);
        jpanelList.get(177).setBackground(Color.RED);
        jpanelList.get(178).setBackground(Color.RED);
        jpanelList.get(179).setBackground(Color.RED);
        jpanelList.get(180).setBackground(Color.RED);
        
        jpanelList.get(181).setBackground(Color.RED);
        jpanelList.get(182).setBackground(Color.RED);
        jpanelList.get(183).setBackground(Color.RED);
        jpanelList.get(184).setBackground(Color.RED);
        jpanelList.get(185).setBackground(Color.WHITE);
        jpanelList.get(186).setBackground(Color.BLUE);
        jpanelList.get(187).setBackground(Color.BLUE);
        jpanelList.get(188).setBackground(Color.WHITE);
        jpanelList.get(189).setBackground(Color.RED);
        jpanelList.get(190).setBackground(Color.RED);
        jpanelList.get(191).setBackground(Color.RED);
        jpanelList.get(192).setBackground(Color.RED);
        jpanelList.get(193).setBackground(Color.RED);
        jpanelList.get(194).setBackground(Color.RED);
        jpanelList.get(195).setBackground(Color.RED);
        jpanelList.get(196).setBackground(Color.RED);
        jpanelList.get(197).setBackground(Color.RED);
        jpanelList.get(198).setBackground(Color.RED);
        jpanelList.get(199).setBackground(Color.RED);
        jpanelList.get(200).setBackground(Color.RED);
        
        jpanelList.get(201).setBackground(Color.RED);
        jpanelList.get(202).setBackground(Color.RED);
        jpanelList.get(203).setBackground(Color.RED);
        jpanelList.get(204).setBackground(Color.RED);
        jpanelList.get(205).setBackground(Color.WHITE);
        jpanelList.get(206).setBackground(Color.BLUE);
        jpanelList.get(207).setBackground(Color.BLUE);
        jpanelList.get(208).setBackground(Color.WHITE);
        jpanelList.get(209).setBackground(Color.RED);
        jpanelList.get(210).setBackground(Color.RED);
        jpanelList.get(211).setBackground(Color.RED);
        jpanelList.get(212).setBackground(Color.RED);
        jpanelList.get(213).setBackground(Color.RED);
        jpanelList.get(214).setBackground(Color.RED);
        jpanelList.get(215).setBackground(Color.RED);
        jpanelList.get(216).setBackground(Color.RED);
        jpanelList.get(217).setBackground(Color.RED);
        jpanelList.get(218).setBackground(Color.RED);
        jpanelList.get(219).setBackground(Color.RED);
        jpanelList.get(220).setBackground(Color.RED);
        
        jpanelList.get(221).setBackground(Color.RED);
        jpanelList.get(222).setBackground(Color.RED);
        jpanelList.get(223).setBackground(Color.RED);
        jpanelList.get(224).setBackground(Color.RED);
        jpanelList.get(225).setBackground(Color.WHITE);
        jpanelList.get(226).setBackground(Color.BLUE);
        jpanelList.get(227).setBackground(Color.BLUE);
        jpanelList.get(228).setBackground(Color.WHITE);
        jpanelList.get(229).setBackground(Color.RED);
        jpanelList.get(230).setBackground(Color.RED);
        jpanelList.get(231).setBackground(Color.RED);
        jpanelList.get(232).setBackground(Color.RED);
        jpanelList.get(233).setBackground(Color.RED);
        jpanelList.get(234).setBackground(Color.RED);
        jpanelList.get(235).setBackground(Color.RED);
        jpanelList.get(236).setBackground(Color.RED);
        jpanelList.get(237).setBackground(Color.RED);
        jpanelList.get(238).setBackground(Color.RED);
        jpanelList.get(239).setBackground(Color.RED);
        jpanelList.get(240).setBackground(Color.RED);
        
        //agregar a panel principal
        for (int i = 1; i <= 240; i++) {
            jpanelList.get(0).add(jpanelList.get(i));
        }
        
        
        
    }
}
