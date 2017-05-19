package datastructure;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListInsertDelete {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList l=new ArrayList();
		for(int i=0;i<n;i++)
		l.add(sc.nextInt());
		
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			String command=sc.next();
			if(command=="Insert"){
				int pos=sc.nextInt();
				int num=sc.nextInt();
				l.add(pos, num);
			}
			else if(command=="Delete"){
				int pos=sc.nextInt();
				l.remove(pos);
				
			}
		}
		
		for(int i=0;i<l.size();i++)
			System.out.print(l.get(i)+" ");
		
		
		
		

	}

}
