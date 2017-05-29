package DaysofCode30;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class PalindromeStackQueue {

	Stack<Character> s=new Stack<Character>();
	Queue q=(Queue) new LinkedList();
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        PalindromeStackQueue p = new PalindromeStackQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	private Character popCharacter() {
		char temp=s.peek();
		s.pop();
		return temp;
	}

	private Character dequeueCharacter() {
		char temp=(char) q.peek();
		q.remove();
		return temp;
	}

	private void enqueueCharacter(char c) {
		q.add(c);
		
	}

	private void pushCharacter(char c) {
		s.push(c);
		
	}
}


