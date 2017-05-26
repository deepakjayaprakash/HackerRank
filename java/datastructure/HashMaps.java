import java.util.*;
import java.io.*;

public class HashMaps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> m=new HashMap<String,Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            m.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            if(m.containsKey(s)){
            	int p=m.get(s);
            	System.out.println(s+"="+p);
            }
            else
            	System.out.println("Not found");
            
        }
        in.close();

	}

}
