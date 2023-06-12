/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

        
/**
 *
 * @author HASAN
 */


public class MainClass extends JWindow{
 
    private Dimension dimensil = Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel labelLogol = new JLabel(new ImageIcon("C:/Users/HASAN/OneDrive/Dokumen/NetBeansProjects/MenuGUI/src/GUI/apache-netbeans.png"));
    private JProgressBar barisProgresl = new JProgressBar();
    private int timel = 0;
    private Timer timerl;
    
    
    public MainClass(){
        
        Color Warna = Color.blue;
        barisProgresl.setValue(0);
        barisProgresl.setPreferredSize(new Dimension(100,15));
        barisProgresl.setBackground(Color.white);
        barisProgresl.setForeground(Color.red);
        barisProgresl.setStringPainted(true);
        barisProgresl.setBorder(new LineBorder (Warna, 1));
        labelLogol.setBorder (new LineBorder (Warna, 1));
        getContentPane().add(labelLogol, BorderLayout.NORTH);
        getContentPane().add(barisProgresl, BorderLayout.CENTER);
        timerl = new Timer(50, new ActionListener()
        {
           
            public void actionPerformed(ActionEvent evt) {
                timel++;
                barisProgresl.setValue(timel);
                if(barisProgresl.getPercentComplete()== 1.0)
                {
                    timerl.stop();
                    setVisible(true);
                    
                }
            }
        
        });
        
        timerl.start();
        pack();
        setLocation(dimensil.width / 2 - getWidth() / 2, dimensil.height / 2 - getHeight() / 2);
        show();
    }
    public static void main(String[] args) {
        new MainClass();
    }       
}
          



        
    