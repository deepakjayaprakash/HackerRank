package DaysofCode30;

import java.util.Scanner;

public class StringToIntException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
        int s=Integer.parseInt(S);
        System.out.println(s);
        }
        catch(Exception e){
        	System.out.println("Bad String");
        }

	}

}
