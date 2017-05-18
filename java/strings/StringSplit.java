package strings;

import java.util.Scanner;

public class StringSplit {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] splits;
        splits=s.split("[,!@._?' ]+");
        // + stands for one or more times
        System.out.println(splits.length);
        for(int i=0;i<splits.length;i++){
        	
        	System.out.println(splits[i]);
        }
        scan.close();
    }
    
}
