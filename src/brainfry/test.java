/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfry;
import javax.swing.JTextField;  
import javax.swing.JFrame;  
  
import java.awt.FlowLayout;  
import java.awt.Font;  
  
public class test  
{  
public static void main(String[]args)  
{  
 //Create text field using JTextField  
 JTextField textField=new JTextField(20);  
  
 //Create font.  
 //Font Name : Default text field font  
 //Font Style : Default text field font style  
 //Font Size : 16  
 Font newTextFieldFont=new Font(textField.getFont().getName(),textField.getFont().getStyle(),24);  
  
 //Set JTextField font using new created font  
 textField.setFont(newTextFieldFont);  
  
 //Create a window using JFrame with title ( Set JTextField text size )  
 JFrame frame=new JFrame("Set JTextField text size");  
  
 //Set JFrame layout to FlowLayout  
 frame.setLayout(new FlowLayout());  
  
 //Add created text field into JFrame  
 frame.add(textField);  
  
 //Set default close operation for JFrame  
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
 //Set JFrame size  
 frame.setSize(400,100);  
  
 //Make JFrame visible  
 frame.setVisible(true);  
}  
} 
