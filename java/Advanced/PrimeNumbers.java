import java.util.*;

public class PrimeNumbers {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter till where you want the prime numbers to be printed?");
		int n=sc.nextInt();
		PrimeNumbersDivideAndConquer(n);
		
		PrimeNumberBruteForce(n);
	}

	private static void PrimeNumberBruteForce(int n) {
		Date start=new Date();
		long t1=start.getTime();
		
		System.out.println("Brute Force method");
		int count=0;
		for(int i=1;i<=n;i++){
			int divisors=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					divisors++;
			}
			if(divisors==2)
				count++;
		}
		Date end=new Date();
		long t2=end.getTime();
		
		System.out.println("Number of prime numbers: "+count+"\nTime taken to run:"+(t2-t1)+" milliseconds");
		
	}

	private static void PrimeNumbersDivideAndConquer(int n) {
		
		Date start=new Date();
		long t1=start.getTime();

		System.out.println("Divide and Conquer method");
		boolean[] b=new boolean[n+1] ;
		for(int i=1;i<=n;i++)
			b[i]=true;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(b[i]==true){
				for(int j=i*i,k=1;j<=n;j=i*i+k*i,k++){
					b[j]=false;
				}
			}
		}
		
	 int count=0;
		for(int i=2;i<=n;i++){
			if(b[i]==true){
				//System.out.println(i);
				count++;
			}
		}
	
		Date end=new Date();
		long t=end.getTime();
		System.out.println("Number of prime numbers:"+count+"\nTime taken to run: "+(t-t1)+" milliseconds");
		
	}

}
