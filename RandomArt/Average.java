
/**
 * Write a description of class Average here.
 * 
 * @author (Ritthikiat and Athitiya) 
 * @version (a version number or a date)
 */
public class Average extends BinaryTree
{// instance variables - replace the example below with your own
    
    private double i;
    private double j;
    private BinaryTree nextTree;
    private BinaryTree ava;
    /**
     * Constructor for objects of class Average
     */
    public Average(int hight)
    {
        nextHight(hight);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void nextHight(int hight){
        i = (int)(Math.random()*3);
        if(hight > 1){
            if(i==0){
                nextTree = new Sin(hight-1);
                ava = new Sin(hight-1);
            }
            if(i==1){
                nextTree = new Cos(hight-1);
                ava = new Cos(hight-1);
            }
            if(i==2){
                nextTree = new Average(hight-1);
                ava = new Average(hight-1);
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
    public double returnValue(double x,double y){
        
        return (nextTree.returnValue(x,y)+ ava.returnValue(x,y))/2 ;
    }
    
    
    public String returnString(){
        
        return "Avg("+nextTree.returnString()+ ava.returnString()+")";
    }
}
