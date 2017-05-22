import java.util.*;

public class StackDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	    
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
          int flag=0;
	       
         
	         char[] ch=input.toCharArray();
	          Stack<Character> s=new Stack<Character>();
	          
	          for(int i=0;i<ch.length;i++){
	        	  if(s.isEmpty())
	        		  s.push(ch[i]);
	        	 
	        	  else if(s.peek()=='{' && ch[i]=='}'){
	        		  s.pop();
	        	  }
	        	  else if(s.peek()=='(' && ch[i]==')'){
	        		  s.pop();
	        	  }
	        	  else if(s.peek()=='[' && ch[i]==']'){
	        		  s.pop();
	        	  }
	        	  else{
	        		  s.push(ch[i]);
	        	  }
	        	  
	          }
	          
	      if(s.isEmpty())
            System.out.println("true");
        else
            System.out.println("false");
  
	}

}
}
