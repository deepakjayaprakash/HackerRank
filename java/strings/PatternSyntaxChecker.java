package strings;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.Scanner;
public class PatternSyntaxChecker {

	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
	
	  for(int i=0;i<testCases;i++)
	  {
	      try
	      {
	     String pattern = sc.nextLine();
	      Pattern.compile(pattern);
	          System.out.println("Valid");
	      }

	         catch (PatternSyntaxException e)
	              {
	      System.out.println("Invalid");
	         //Write your code
	  }
	      
	  } 
	}
	}
