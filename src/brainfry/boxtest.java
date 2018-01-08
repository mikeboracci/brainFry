/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfry;

/**
 *
 * @author Mike
 */  import java.awt.*;
import javax.swing.*;
public class boxtest {
    
  



  public static void main(String args[]) {
    JFrame frame = new JFrame("X Alignment");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Box box = Box.createVerticalBox();
    JButton button = new JButton("LL");
    button.setAlignmentX(Component.LEFT_ALIGNMENT);
    box.add(button);
    button = new JButton("CC");
    button.setAlignmentX(Component.CENTER_ALIGNMENT);
    box.add(button);
    button = new JButton("RR");
    button.setAlignmentX(Component.RIGHT_ALIGNMENT);
    box.add(button);
    frame.add(box, BorderLayout.CENTER);

    frame.setSize(300, 200);
    frame.setVisible(true);}
}

