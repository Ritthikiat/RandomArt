import java.awt.Dimension;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("RandomArt");
		Mainframe mainframe = new Mainframe();
	    frame.add(mainframe);
		frame.setSize(new Dimension(250,150));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
	


}
