/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author syedahmed
 */
public class SnackBar {
    public static void showSnackBar(JFrame parent, String message) {
        // Create an undecorated JWindow acting as the snack bar
        JWindow snackBar = new JWindow(parent);
        snackBar.setLayout(new BorderLayout());

        // Style the panel (dark background, white text)
        JPanel panel = new JPanel();
        panel.setBackground(new Color(50, 50, 50));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        JLabel label = new JLabel(message);
        label.setForeground(Color.WHITE);
        panel.add(label);
        
        snackBar.add(panel, BorderLayout.CENTER);
        snackBar.pack();

        // Position the snack bar at the bottom center of the parent frame
        Point loc = parent.getLocationOnScreen();
        int x = loc.x + (parent.getWidth() - snackBar.getWidth()) / 2;
        int y = loc.y + parent.getHeight() - snackBar.getHeight() - 50;
        snackBar.setLocation(x, y);

        // Show the snack bar
        snackBar.setVisible(true);

        // Timer to hide the snack bar after 3 seconds (3000 ms)
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snackBar.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

}