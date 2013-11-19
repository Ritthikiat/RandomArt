/**
 * Write a description of class ArtFrame here.
 * 
 * @author (Ritthikiat and Athitiya) 
 * @version (a version number or a date)
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.*;
import java.awt.TextField;

public class ArtFrame extends JPanel{
    
    public RandomArt art; 
    private JPanel tap ;
   
    public ArtFrame(){
        setLayout(new BorderLayout());
        add(tap(),BorderLayout.NORTH);
        this.art = new RandomArt();
        
        
    }
    
    public JPanel tap(){
        tap = new JPanel();
        tap.setLayout(new FlowLayout());
        tap.setBackground(Color.black);
        tap.setPreferredSize(new Dimension(20,190)); 
        tap.add(tap2());
        tap.add(name2());
        tap.add(name());
       
        return tap;
    }
    
    public JPanel tap2(){
        JPanel tap2 = new JPanel();
        tap2.setLayout(new GridLayout(2,1,3,3));
        tap2.add(button1());
        tap2.add(button2());
        
        return tap2;
    }
    
    public JLabel name(){
        JLabel name = new JLabel();
        name.setText(" Ritthikiat and Athitiya  ");
        name.setForeground(Color.WHITE);
        
        return name;
    }
    
    public JLabel name2(){
        JLabel name = new JLabel();
        name.setText("   by   ");
        name.setForeground(Color.WHITE);
        
        return name;
    }
    
    public JButton button1(){
        JButton button = new JButton("Generate");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                JFrame frame = new JFrame("Image");
                frame.setLocation(400, 100);
                art =  new RandomArt();
                frame.add(art);
                frame.setSize(new Dimension(480,500));
                frame.setVisible(true);
                
            }
        });
        
        return button;
    }
    
    public JButton button2(){
        JButton button = new JButton("Function log");
        button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
        {
            if(art != null){   
            JFrame frame = new JFrame("function");
            TextField t1 = new TextField();
            TextField t2 = new TextField();
            TextField t3 = new TextField();
            frame.setLayout(new GridLayout(3,1,3,3));
            t1.setText(" R = "+art.returnFunctionR());
            t2.setText(" G = "+art.returnFunctionG());
            t3.setText(" B = "+art.returnFunctionB());
            frame.add(t1);
            frame.add(t2);
            frame.add(t3);
            frame.setSize(new Dimension(480,200));
            frame.pack();
            frame.setVisible(true);
          }
        }
    });
        
        return button;
    }
}
