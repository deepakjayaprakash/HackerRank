package strings;

import java.util.Scanner;

public class IsValidIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            String[] splits;
            splits=IP.split("[.]+");
           
            ///////////////////////////
            // Only dots must be there
            
            if(splits.length>3)
            {
            	System.out.println("false");
            	continue;
            }
            
            ///////////////////////
        	   int flag=1;
            for(int i=0;i<splits.length;i++){
            	int num=0;
            	
            	/////////////////////////////////
            	// Only digits are allowed
            	
            	try{
            	 num=Integer.parseInt(splits[i]);
            		if(num>=0 && num<=255)
                		flag=1;
                	else
                		 {
                		flag=0;
                		break;
                		 }
            		
            	}catch(Exception e){
            		  
            		  flag=0;break;
            	}
            	
            
            		 }
		/////////////////
       if(flag==0)
    	   System.out.println("false");
       else
    	   System.out.println("true");
           }
        
        
	}

}
