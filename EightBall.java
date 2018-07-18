/*
Clinten Imada
4/24/2018
CS 1400
Project 12
 */

package com.company;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class EightBall extends JFrame{

    String ans = "";
    Random r = new Random();
    private JTextField entry;
    private JLabel jLabel1;
    private JLabel error;
    private JDialog response;
    FlowLayout daLayout = new FlowLayout();
    JButton askReceive = new JButton("Ask and Receive Your Answer");

    public EightBall(String s) {
        super(s);
    }

    public String answer() {

        int get = 1 + r.nextInt(15);

        if (get == 1) {
            ans = "Fo' sho'.";
            return ans;
        } else if (get == 2) {
            ans = "Mos' def'.";
            return ans;
        } else if (get == 3) {
            ans = "No doubt.";
            return ans;
        } else if (get == 4) {
            ans = "Word.";
            return ans;
        } else if (get == 5) {
            ans = "Hell nah.";
            return ans;
        } else if (get == 6) {
            ans = "Don't bet on it.";
            return ans;
        } else if (get == 7) {
            ans = "Nope.";
            return ans;
        } else if (get == 8) {
            ans = "You can take it to da bank.";
            return ans;
        } else if (get == 9) {
            ans = "No way.";
            return ans;
        } else if (get == 10) {
            ans = "...Yes?";
            return ans;
        } else if (get == 11) {
            ans = "You think my head is made out of a fire?! Try again.";
            return ans;
        } else if (get == 12) {
            ans = "Ask me again later.";
            return ans;
        } else if (get == 13) {
            ans = "You're not gonna like my answer...";
            return ans;
        } else if (get == 14) {
            ans = "Too foggy, try again.";
            return ans;
        } else if (get == 15) {
            ans = "Don't talk to me like I got a flower-pot head!";
            return ans;
        } else {
            ans = "ERROR!";
            return ans;
        }
    }

    public void daComponents(final Container pane) {

        entry = new JTextField();
        entry.setColumns(30);
        jLabel1 = new JLabel();
        jLabel1.setText("Enter the question you would like to ask:");
        error = new JLabel();
        error.setText("You gonna ask me a question or what?!");
        error.setVisible(false);
        daLayout.setAlignment(FlowLayout.CENTER);
        JPanel butts = new JPanel();
        JFrame exception = new JFrame();
        butts.add(jLabel1);
        butts.add(entry);
        butts.add(askReceive);
        butts.add(error);

        askReceive.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer();
                try {
                    if (entry.getText().equals("")) {
                        response.setVisible(false);
                        error.setVisible(true);
                    } else {
                        error.setVisible(false);
                        JOptionPane.showMessageDialog(response, ans, "Your Fortune", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NullPointerException p) {
                        //JOptionPane.showMessageDialog(exception, "You gonna ask me a question or what?!", "Error", JOptionPane.WARNING_MESSAGE);
                        error.setVisible(true);
                }
            }
        });

        pane.add(butts, BorderLayout.CENTER);
    }

    private static void GUI() {

        EightBall frame = new EightBall("Dodgy 8-Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.daComponents(frame.getContentPane());
        frame.setSize(400,150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> GUI());
    }
}
