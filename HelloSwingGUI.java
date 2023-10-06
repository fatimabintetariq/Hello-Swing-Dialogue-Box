/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloswinggui;

/**
 *
 * @author fatimabintetariq
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwingGUI {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello, Swing!");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 150);

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("Click Me");
        jButton.setMargin(new Insets(10, 10, 10, 10));
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(jFrame, "Hello, Swing!");
                System.exit(0);
            }
        });

        jPanel.setLayout(new GridBagLayout());

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dimension.width / 2 - jFrame.getSize().width / 2, dimension.height / 2 - jFrame.getSize().height / 2);

        jFrame.setVisible(true);
    }
}
