package strings;

import java.util.Scanner;

public class StringPalindrome {

	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        StringBuffer rev=new StringBuffer(A).reverse();
	        String B=rev.toString();
	        int cmp=A.compareTo(B);
	        if(cmp==0)
	        	System.out.println("Yes");
	        else
	        	System.out.println("No");
	        
}
}
