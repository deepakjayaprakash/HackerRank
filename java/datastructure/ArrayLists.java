package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int d,q,x,y;
	    ///////////////////////////////////////////////////////////////
	    // Basically ArrayList is also a datatype like int.
	    // It is created in the syntax
	    // ArrayList b=new ArrayList();
	    // Here we are creating an array of ArrayLists
	    ///////////////////////////////////////////////////////////////
	    
		ArrayList[] a=new ArrayList[n];
		for(int i=0;i<n;i++){
			d=in.nextInt();
					
			a[i]=new ArrayList();
			
			for(int j=0;j<0;j++)
			a[i].add(in.nextInt());	
			
			q=in.nextInt();
			
			for(int k=0;k<q;k++){
		        x=in.nextInt();
		        y=in.nextInt();
		        
		        try{
		            System.out.println(a[x-1].get(y-1));
		        } catch(Exception e){
		            System.out.println("ERROR!");
		        }
		        
			}
			
			
		}

	}

}
