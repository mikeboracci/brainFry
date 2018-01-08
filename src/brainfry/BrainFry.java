/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfry;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BrainFry {

    public static void main(String[] args) {

        //Ask the user if they want to proceed
        JFrame questionFrame = new JFrame();
        String userMessage = "Would you like to get smarter?";
        int answer = JOptionPane.showConfirmDialog(questionFrame, userMessage);
        if (answer == JOptionPane.YES_OPTION) {
            // User clicked YES - This is the confirmation dialog.
            //creates a variable called "userName" which will hold the input from the dialog box field
            String userName = JOptionPane.showInputDialog(null, "What is your name brave soul?");
            // Get the user's name
            //assign a variable to the input from Scanner
            Scanner nameInput = new Scanner(System.in);
            // Print their name in a message and ask them if they are ready.
            System.out.println(userName);
            //without JOptionPane.YES_NO_OPTION it won't work as written -- This is the test to see if they really want to continue.
            int confirmGo = JOptionPane.showConfirmDialog(questionFrame, "Ok " + userName + ", are you ready to start?", "", JOptionPane.YES_NO_OPTION);
            if (confirmGo == JOptionPane.YES_OPTION) {

                //Create the testing space
                JFrame frame = new JFrame("");

                frame.setSize(640, 480);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit if the user closes the window
                //instantiate a box
                Box box = Box.createVerticalBox();
                frame.add(box, BorderLayout.CENTER);

                //Add the field that will display the number to the user
                JLabel compLabel = new JLabel("Watch this box carefully for your number");
                compLabel.setHorizontalAlignment(JLabel.CENTER);

                //Creates new field for output
                JTextField compField = new JTextField();
                Font compFont = new Font("Arial", Font.BOLD, 30);
                compField.setFont(compFont);
                compField.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                compField.setHorizontalAlignment(compField.CENTER);
                
                
                
                RandomGen compDisp = new RandomGen();
                System.out.println("your number is" + compDisp);

                // adds field and label to the box
                box.add(compLabel);
                box.add(compField);

                // Add the field that will accept the users recalled number
                JLabel userLabel = new JLabel("Enter your number here");
                userLabel.setHorizontalAlignment(JLabel.CENTER);
                JTextField userField = new JTextField("");
                userField.setHorizontalAlignment(JTextField.CENTER);

                box.add(userLabel);
                box.add(userField);

                // if the user bails , they get a nasty mesage.
            } else if (confirmGo == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(questionFrame, "EPIC FAIL");
            }

        } else if (answer == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(questionFrame, "Ignorance is bliss for those not smart enough to realize that life is about learning.");
            System.exit(0);
        }

    }

    
}
