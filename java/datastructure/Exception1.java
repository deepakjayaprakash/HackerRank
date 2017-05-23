import java.util.*;

public class Exception1 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
	        try{
	            int a,b;
	            
	            a=s.nextInt();
	            b=s.nextInt();
	            
	            System.out.println(a/b);
	        }
	        catch(InputMismatchException e1){
	        	System.out.println("java.util.InputMismatchException");
	        }
	        
	        catch(ArithmeticException e2){
	        	System.out.println("java.lang.ArithmeticException: / by zero");
	        }
	        
	       
	}

}
