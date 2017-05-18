package strings;

import java.util.Scanner;

public class Anagrams {

	public static  boolean isAnagram(String a,String b){
		b=b.toLowerCase();
		a=a.toLowerCase();
		//System.out.println(a+b);
		int count1[] =new int[26];
		int count2[]=new int[26];
		for(int i=0;i<a.length();i++)
			count1[a.charAt(i)-97]++;
		for(int i=0;i<b.length();i++)
			count2[b.charAt(i)-97]++;
		
		for(int i=0;i<count1.length;i++){
			if(count1[i]!=count2[i])
			{
				
				return false;
			}
			
				
		}
		return true;
		
		
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		b=sc.next();
		boolean res=isAnagram(a,b);
		if(res==true)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
	

}
