import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.TextField;

public class Mainframe extends JPanel{
    
	private RandomArt art; 
	
	public Mainframe(){
		setLayout(new BorderLayout());
		add(tap(),BorderLayout.NORTH);
		
		RandomArt rd = new RandomArt();
		repaint();
	    add(rd);
	}
	public JPanel tap(){
		JPanel tap = new JPanel();
		tap.setLayout(new FlowLayout());
		tap.setBackground(Color.black);
		tap.setPreferredSize(new Dimension(20,190));
		tap.add(menubar1());
		tap.add(tap2());
		tap.add(button3());
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
		name.setText("     xxxxxxxx     ");
		name.setForeground(Color.WHITE);
		
		
		return name;
	}
	
	
	
	public JButton button1(){
		JButton button = new JButton("Generate");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
			JFrame frame = new JFrame("Image");
	            art = new RandomArt();
	            frame.setLocation(400, 100);
				frame.add(art);
				frame.setSize(new Dimension(480,500));
				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
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
			
			t1.setText(" R = "+art.returnFuctionR());
			t2.setText(" G = "+art.returnFuctionG());
			t3.setText(" B = "+art.returnFuctionB());
			frame.add(t1);
			frame.add(t2);
			frame.add(t3);
			
			
			frame.setSize(new Dimension(480,200));
		    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.pack();
		    frame.setVisible(true);
		  }
		}
	});
		
		return button;
	}
	
	public JButton button3(){
		JButton button = new JButton("Save");
		
		return button;
	}
	
	public JMenuBar menubar1(){
		JMenuBar menubar = new JMenuBar();
		JMenu file1 = new  JMenu("Color"); 
		JMenu file2 = new  JMenu("Quality");
		JMenuItem rgb = new JMenuItem("RGB");
		JMenuItem bw = new JMenuItem("BW");
		JMenuItem low = new JMenuItem("LOW");
		JMenuItem medium = new JMenuItem("MEDIUM");
		JMenuItem high = new JMenuItem("HIGH");
		file1.setPreferredSize(new Dimension(50,20));
		file1.add(rgb);
		file1.add(bw);
		file2.add(low);
		file2.add(medium);
		file2.add(high);

		  
		menubar.add(file1);
		menubar.add(file2);
		
		
		
	    return menubar;
		
		
	}
	
	
	
	
	
	

}
