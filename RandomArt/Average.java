
/**
 * Write a description of class Average here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Average extends Tree
{
    // instance variables - replace the example below with your own
    
    private double i;
    private double j;
    private Tree nextTree;
    private Tree ava;
    /**
     * Constructor for objects of class Average
     */
    public Average(int level)
    {
        i = (int)(Math.random()*3);
        if(level > 1){
            if(i==0){
                nextTree = new Sin(level-1);
                ava = new Sin(level-1);
            }
            if(i==1){
                nextTree = new Cos(level-1);
                ava = new Cos(level-1);
            }
            if(i==2){
                nextTree = new Average(level-1);
                ava = new Average(level-1);
            }

        }else{
            j = (int)(Math.random()*2);
            if(j==0){
                nextTree = new VariableX();
                ava = new VariableX();
            }
            if(j==1){
                nextTree = new VariableY();
                ava = new VariableY();
            }
        }

        
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double returnDouble(double x,double y){
        
        return (nextTree.returnDouble(x,y)+ ava.returnDouble(x,y))/2 ;
    }
    
    
    public String returnString(){
        
        return "Avg("+nextTree.returnString()+ ava.returnString()+")";
    }
}
