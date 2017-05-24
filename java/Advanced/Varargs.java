import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
class Add{
	public static void add(int a,int b){
		System.out.println(a+"+"+b+"="+(a+b));
		
	}

	public void add(int n1, int n2, int n3) {
		System.out.println(n1+"+"+n2+"+"+n3+"="+(n1+n2+n3));
		
	}

	public void add(int n1, int n2, int n3, int n4, int n5) {
		System.out.println(n1+"+"+n2+"+"+n3+"+"+n4+"+"+n5+"="+(n1+n2+n3+n4+n5));
		
	}
	public void add(int n1, int n2, int n3, int n4, int n5,int n6) {
		System.out.println(n1+"+"+n2+"+"+n3+"+"+n4+"+"+n5+"+"+n6+"="+(n1+n2+n3+n4+n5+n6));
		
	}
	
}

 class Solution {

    public static void main(String[] args) {
       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	

}
