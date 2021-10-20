import java.lang.*;
import java.util.ArrayList;



public class Fml{
	public ArrayList<Double> userList;
	public double variant;
	public double constant;
	public double difG ;
	
	public Fml(ArrayList<Double> user){
		userList = user;
		constant = userList.get(0);
		variant = (userList.get(2)-user.get(1));
		difG = userList.get(2)/user.get(1);
	}
	

	public  void printExplicit(){
		System.out.println("Explicit: ");
		System.out.println("a(n)= "+constant + " + ("+variant + ")(n-1)");
	}
	public  void printRecursive(){
	    System.out.println("Recursive: ");
	    System.out.println("a1 = "+ constant);
	    System.out.println("a(n*) = "+ variant + " + a(n-1*)" );
	}
	
	 public  void printRecursiveG(){
        System.out.println("Recursive: ");
        System.out.println("a1 = " + constant );
        System.out.println("a(n*) = "+difG+"^(n-1*)");
    }
    public  void printExplicitG(){
        System.out.println("Explicit: ");
        System.out.println("a(n) = "+ constant + "("+ difG + ")^n-1");
    }
	
}