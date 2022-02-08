package tenthProblem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class tenthProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		
		int DequeSize = scan.nextInt();
		
		System.out.println("Enter the deque elements");
		
		Deque<Character> dq = new ArrayDeque<>();
		
		for(int i=0;i<DequeSize;i++) {
			char c = scan.next().charAt(0);
			dq.add(c);
		}
		
		System.out.println("Enter the Array size");
		
		int arraySize= scan.nextInt();
		
		List<Integer> u = new ArrayList<>();
		
		System.out.println("Enter array Elements");

		for(int i=0;i<3;i++) {
			int element = scan.nextInt();
			u.add(element);
		}
		
		String res = getDeque(dq,u);
		System.out.println(res);
	}
	
	public static String getDeque(Deque<Character> dq,List<Integer> u){
		
		char element = '$';
		
		for(int i=0;i<u.size();i++) {
			
			if(u.get(i)==0) {;
				
				if(element!='$')
				dq.addFirst(element);
			}
			
			if(u.get(i)==1 && !dq.isEmpty())
			element = dq.pollFirst();
		}
		
		StringBuilder strb = new StringBuilder();
		
		while(!dq.isEmpty()) {
			
			strb.append(dq.poll());
		}
		
		return strb.toString();
		
	}
	
	
}
