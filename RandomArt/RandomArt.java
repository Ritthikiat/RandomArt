/**
 * Write a description of class RandomArt here.
 * 
 * @author (Ritthikiat and Athitiya) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class RandomArt extends JPanel {
    
    private BinaryTree treeRed;
    private BinaryTree treeGreen;
    private BinaryTree treeBlue;
    private String functionR;
    private String functionG;
    private String functionB;
    
    
    public RandomArt(){
        randomPanel();
        functionR = treeRed.returnString();
        functionG = treeGreen.returnString();
        functionB = treeBlue.returnString();
    }
    
    public void randomPanel(){
        
        int red = (int)(Math.random()*3);
        if(red == 0){
            treeRed = new Sin((int)(Math.random()*8+4));
            
        }
        else if(red == 1){
            treeRed = new Cos((int)(Math.random()*8+4));
        }
        else if(red == 2){
            treeRed = new Average((int)(Math.random()*8+4));
        }
        
        
        int green = (int)(Math.random()*3);
        if(green == 0){
            treeGreen = new Sin((int)(Math.random()*8+4));
            
        }
        else if(green == 1){
            treeGreen = new Cos((int)(Math.random()*8+4));
        }
        else if(green == 2){
            treeGreen = new Average((int)(Math.random()*8+4));
        }
        
        int blue =(int)(Math.random()*3);
         if(blue == 0){
            treeBlue = new Sin((int)(Math.random()*8+4));
            
            
        }
        else if(blue == 1){
            treeBlue = new Cos((int)(Math.random()*8+4));
        }
        else if(blue == 2){
            treeBlue = new Average((int)(Math.random()*8+4));
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
            for(int j = 0; j < getHeight(); j++ ){
                double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
                double y = ((((double) j) / getHeight()) * 2.0) - 1.0;
                double red = treeRed.returnValue( x,  y);
                double green = treeGreen.returnValue( x,  y);
                double blue = treeBlue.returnValue( x,  y);
                
                g2d.setColor(new Color(rgb(red),rgb(green),rgb(blue)));
                g2d.fillRect(i, j, i, j);
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
