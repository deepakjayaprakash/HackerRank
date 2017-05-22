package datastructure;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListInsertDelete {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer> l=new ArrayList();
		for(int i=0;i<n;i++)
		l.add(sc.nextInt());
		
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++)
		{
			String command=sc.next();
			// Lesson: Never use == to compare strings
			
			if(command.compareTo("Insert")==0){
				//System.out.println("Inside if");
				int pos=sc.nextInt();
				int num=sc.nextInt();
				l.add(pos, num);
			}
			
			else if(command.compareTo("Delete")==0){
				int pos=sc.nextInt();
				l.remove(pos);
				
			}
			
		}
		
		for(int i=0;i<l.size();i++)
			System.out.print(l.get(i)+" ");
		
		
		
		

	}

}
