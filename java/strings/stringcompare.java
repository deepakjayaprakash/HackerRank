package strings;

import java.util.Arrays;
import java.util.Scanner;

public class stringcompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
       
        String subs[]= new String[s.length()-n+1];
        for(int i=0;i<s.length()-n+1;i++)
        	subs[i]=s.substring(i,i+n);
        
        Arrays.sort(subs);
       
        	System.out.println(subs[0]);
        	System.out.println(subs[subs.length-1]);
    
    }
}
