import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class RandomArt extends JPanel {
    
    private Tree tRed;
    private Tree tGreen;
    private Tree tBlue;
    private String functionR;
    private String functionG;
    private String functionB;
    
    
    public RandomArt(){
        randomPanel();
        functionR = tRed.returnString();
        functionG = tGreen.returnString();
        functionB = tBlue.returnString();
    }
    
    public void randomPanel(){
        
        int red = (int)(Math.random()*3);
        if(red == 0){
            tRed = new Sin((int)(Math.random()*8+6));
            
        }
        else if(red == 1){
            tRed = new Cos((int)(Math.random()*8+6));
        }
        else if(red == 2){
            tRed = new Average((int)(Math.random()*8+6));
        }
        
        
        int green = (int)(Math.random()*3);
        if(green == 0){
            tGreen = new Sin((int)(Math.random()*8+6));
            
        }
        else if(green == 1){
            tGreen = new Cos((int)(Math.random()*8+6));
        }
        else if(green == 2){
            tGreen = new Average((int)(Math.random()*8+6));
        }
        
        int blue =(int)(Math.random()*3);
         if(blue == 0){
            tBlue = new Sin((int)(Math.random()*8+6));
            
            
        }
        else if(blue == 1){
            tBlue = new Cos((int)(Math.random()*8+6));
        }
        else if(blue == 2){
            tBlue = new Average((int)(Math.random()*8+6));
        }
        
        
    }
    
    public String returnFunctionR(){
        return functionR;
    }
    public String returnFunctionG(){
        return functionG;
    }
    public String returnFunctionB(){
        return functionB;
    }
    
    public void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        
        for(int i = 0; i < getWidth(); i++){
            for(int o = 0; o < getHeight(); o++ ){
                double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
                double y = ((((double) o) / getHeight()) * 2.0) - 1.0;
                double red = tRed.returnValue( x,  y);
                double green = tGreen.returnValue( x,  y);
                double blue = tBlue.returnValue( x,  y);
                
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
