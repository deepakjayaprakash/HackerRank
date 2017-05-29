
package DaysofCode30;
import java.io.*;
import java.util.*;

import java.math.*;


public class BinaryNumbers {

	public static void main(String[] args) {
		 
		        Scanner in = new Scanner(System.in);
		        ArrayList<Integer>a=new ArrayList<Integer>();
		        int n = in.nextInt();
		        int temp=n;
		        long binary=0; // Consists of binary number as a number
		        int k=1;
		        while(n!=0){
		        	int d=n%2;
		        	a.add(d);
		        	binary=d*k+binary;
		        	n/=2;
		        	k*=10;
		        	
		        }
		      
		        // Reverse the list since its a binary number
		        Collections.reverse(a);
		        
		        int max=findMaxConsecutiveOnes(a);
		        System.out.println(max);
		        
	}

	private static int findMaxConsecutiveOnes(ArrayList<Integer> a) {
		/*
		 * Finds out consecutive ones in DP
		 */
		
		int temp=0;
		int max_till_here=0;
		
		for(int i=0;i<a.size();i++){
			if(a.get(i)==0){
				temp=0;
			}
			else{
				temp+=1;
				if(temp>max_till_here)					
					max_till_here=temp;
			}
		}
		return max_till_here;
		
		
	}

}
