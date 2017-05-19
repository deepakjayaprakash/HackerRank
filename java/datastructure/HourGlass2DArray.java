package datastructure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        //////////////////////////////
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        //////////////////////////////
        int sum_max=0,r=0,c=0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
            	if(i>1 && j>1 && i<5 && j<5){
                int sum=arr[i][j]+arr[i-1][j]+arr[i+1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j+1];
                if(sum>sum_max){
                	r=i;
                	c=j;
                	sum_max=sum;
                }
            	}
            }
        }
        System.out.println(sum_max+" "+r+" "+c);
        
        
    }
}
