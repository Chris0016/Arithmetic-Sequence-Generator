import java.lang.*;
public class FmlS{
    double constant;
    double variant;
     
    
    public FmlS(double a , double b){
        constant = a ;
        variant = b;
        
    }
    public  void generateAL(int lsize){
        System.out.print(" ");
        double output;
        System.out.print(constant);
        for (int i = 1; i < lsize ; i++){
             output = constant + variant*(i);
             System.out.print( " , " +output );
    
        }
        System.out.println();
    }
    public void generateGL(int lsize){
        System.out.print(" ");
        System.out.print(constant);
        for ( int i =2 ; i < lsize; i++){
            System.out.print(" , "+constant*Math.pow(variant, i-1) );
        }
        System.out.println();
    }
    public double numAtG(int pos){
        return constant * Math.pow(variant, pos-1 );
    }
    public double numAtA(int pos){
        return constant + variant*(pos-1);
    }
}