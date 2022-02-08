package ninethProblem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ninethProblem {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter the numbers ");
		
		Scanner scan = new Scanner(System.in);
		
		Queue<Integer> dq = new ArrayDeque<>();
		
		for(int i=0;i<4;i++) {
			int element = scan.nextInt();
			dq.add(element);
		}
		
		List<Integer> li = GetEvenOdd(dq);
		System.out.println(li);
	}
	
	public static List<Integer> GetEvenOdd(Queue<Integer> dq){
		
		Queue<Integer> EvenNumList = new LinkedList<>();
		Queue<Integer> OddNumList = new LinkedList<>();
		
		while(!dq.isEmpty()) {
			
			int element = dq.poll();
			
			if(element%2==0) {
				
				EvenNumList.add(element);
			}
			
			else {
				
				OddNumList.add(element);
			}
		
		}
	    List<Integer> list = new ArrayList<>();
	    
	    while(!EvenNumList.isEmpty() || !OddNumList.isEmpty()) {
	    	if(!EvenNumList.isEmpty()) {
	    		list.add(EvenNumList.poll());
	    	}
	    	
	    	if(!OddNumList.isEmpty()) {
	    		list.add(OddNumList.poll());
	    	}
	    	
	    }
	    
		return list;
		
	}
	
	
}
