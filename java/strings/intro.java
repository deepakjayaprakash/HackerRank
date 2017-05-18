package strings;

import java.util.Scanner;

public class intro {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        int l=A.length()+B.length();
	        System.out.println(l);
	        int cmp=A.compareTo(B);
	        if(cmp>0)
	        	System.out.println("Yes");
	        else
	 			System.out.println("No");
			
	        String res=A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length());
	        System.out.println(res);
			
	}

}
