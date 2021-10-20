import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

public class MyProgram
{
	 public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("      Arithmetic Sequence Generator\n");
    	
    	System.out.println("n* implies a subscript");
    	while(true){
    	   System.out.println(" Arithmetic formula: ");
           System.out.println(" a(n*) = d(n-1) + a1* \n");
          System.out.println(" Geometric formula: ");
          System.out.println( " a(n*) = a1* x r^(n-1)\n" );

    	System.out.print( "Generate a sequence/number at position,  or generate formula\n(s for sequence, f for formula): ");
    	String cmd = input.nextLine();
    	
    	while(true){
    	    
    	    if (cmd.equals("s") || cmd.equals("f")){
    	        break;
    	    }
    	    System.out.println("Your input is not available");
    	    System.out.println("Generate a sequence or generate formula?(s for sequence, f for formula , P): ");
    	    cmd = input.nextLine();
    	    }
    	   System.out.print("Arithmetic or Geometric?( Arith for Arithmetic, Geo for Geometric ): ");
    	    String type = input.nextLine();
    	    while(true){
    	    
    	    if (type.equals("Arith") || type.equals("Geo")){
    	        break;
    	    }
    	    System.out.println("Your input is not available");
    	    System.out.print("Arithmetic or Geometric?( Arith for Arithmetic, Geo for Geometric ): ");
    	    type = input.nextLine();
    	    }
    	   
    	
    	if (cmd.equals("s") ){

          System.out.print(" Enter a1:");
    	  double  a1 = input.nextDouble();
    	  System.out.print(" Enter d/r: ");
    	  double d = input.nextDouble();
    	  System.out.print("Genrate sequence or number(s for sequence, n for number): ");
    	  input.nextLine();
    	  String sOrN= input.nextLine();
    	   
    	   
    	    while(true){
    	    
    	    if (sOrN.equals("s") || sOrN.equals("n")){
    	        break;
    	    }
    	    System.out.println("Your input is not available");
    	    System.out.print(" Genrate sequence or number(s for sequence, n for number): ");
    	    sOrN = input.nextLine();
    	    }
    	  FmlS op = new FmlS(a1, d);
    	  
    	  if (sOrN.equals("s")){
    	  System.out.print(" Enter the list size: ");
    	  int size = input.nextInt();
    	   
    	    if (type.equals("Arith")){
    	    	op.generateAL(size);
    	    }
    	    else if(type.equals("Geo")){
                    op.generateGL(size);
    	    }
    	    
    	  }
    	  else {
    	       System.out.print("Enter position: ");
    	       int val = input.nextInt();
    	       if (type.equals("Arith")){
    	            System.out.println(" "+ op.numAtA(val));
    	        }
    	        else if(type.equals("Geo")){
                     System.out.println(" "+ op.numAtG(val));
    	    }
    	  }
    	    
    	}
    	
    	
    	else if( cmd.equals("f")) {
  
    	
    	System.out.print(" How many numbers do you want to submit(doesn't have to be exact): ");
    	int amount = input.nextInt();

    	ArrayList<Double> numList = new ArrayList<Double>();
    	double userNums;
    	for (int i = 0 ; i < amount ; i++){
    		System.out.print(" Enter "+(i) + " number: ");
    		userNums = input.nextDouble();
    		numList.add(userNums);

    	}
    	Fml op = new Fml(numList);
    	if (type.equals("Arith")){
        op.printRecursive();
        op.printExplicit();
    	}else {
    	    op.printRecursiveG();
    	    op.printExplicitG();
    	}
    	}
    
    	System.out.println(" Continue(\"no\" to quit): ");
    	input.nextLine();
    	String last = input.nextLine();
    	if (last.equals("no")){
    	    input.close();
    	    System.out.println("Thank you!!!\n");
    	    break;
    	    
    	}
    	
    	
    }
	}
}