import java.awt.Dimension;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("RandomArt");
		Artframe mainframe = new Artframe();
	    frame.add(mainframe);
		frame.setSize(new Dimension(350,120));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
	


}
