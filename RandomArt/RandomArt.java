import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class RandomArt extends JPanel {
    
    private Tree tred;
    private Tree tgreen;
    private Tree tblue;
    private String fuctionr;
    private String fuctiong;
    private String fuctionb;
    
	
    public RandomArt(){
        
        randomPanel();
        fuctionr = tred.returnString();
        fuctiong = tgreen.returnString();
        fuctionb = tblue.returnString();
   
    }
    
    public void randomPanel(){
        
        int red = (int)(Math.random()*3);
        if(red == 0){
            tred = new Sin((int)(Math.random()*8+4));
            
        }
        else if(red == 1){
            tred = new Cos((int)(Math.random()*8+4));
        }
        else if(red == 2){
            tred = new Average((int)(Math.random()*8+4));
        }
        
        
        int green = (int)(Math.random()*3);
        if(green == 0){
            tgreen = new Sin((int)(Math.random()*8+4));
            
        }
        else if(green == 1){
            tgreen = new Cos((int)(Math.random()*8+4));
        }
        else if(green == 2){
            tgreen = new Average((int)(Math.random()*8+4));
        }
        
        int blue =(int)(Math.random()*3);
         if(blue == 0){
            tblue = new Sin((int)(Math.random()*6+4));
            
            
        }
        else if(blue == 1){
            tblue = new Cos((int)(Math.random()*6+4));
        }
        else if(blue == 2){
            tblue = new Average((int)(Math.random()*6+4));
        }
        
        
    }
	
    public String returnFuctionR(){
        return fuctionr;
    }
    public String returnFuctionG(){
        return fuctiong;
    }
    public String returnFuctionB(){
        return fuctionb;
    }
    
	public void doDrawing(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		for(int i = 0; i < getWidth(); i++){
			for(int o = 0; o < getHeight(); o++ ){
			    double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
                double y = ((((double) o) / getHeight()) * 2.0) - 1.0;
                double red = tred.returnValue( x,  y);
                double green = tgreen.returnValue( x,  y);
                double blue = tblue.returnValue( x,  y);
				g2d.setColor(new Color(rgb(red),rgb(green),rgb(blue)));
				g2d.fillRect(i, o, i, o);
			}
		}
	}
	
	public void paintComponent (Graphics g){
		
		super.paintComponent(g);
		doDrawing(g);
		
		
	}
	public int rgb(double x){
	    return (int)((x+1)*255/2);
	    
	    
	   }
	   
	   
	   
	   
	
	


}
