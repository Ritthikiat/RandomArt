/**
 * Write a description of class RandomArtProject here.
 * 
 * @author (Ritthikiat and Athitiya) 
 * @version (a version number or a date)
 */
import java.awt.Dimension;

import javax.swing.JFrame;


public class RandomArtProject {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("RandomArt");
		ArtFrame mainframe = new ArtFrame();
	    frame.add(mainframe);
		frame.setSize(new Dimension(350,120));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
	


}
