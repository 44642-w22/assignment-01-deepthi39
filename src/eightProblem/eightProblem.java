package eightProblem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class eightProblem {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	    System.out.println("Enter the numbers ");
		
		Scanner scan = new Scanner(System.in);
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i=0;i<4;i++)
		{
			int element = scan.nextInt();
			dq.add(element);
		}
		
		List<Integer> li = getAltSeq(dq);
		System.out.println(li);
	}
	
	
	public static List<Integer> getAltSeq(Deque<Integer> dq){
		
		List<Integer> list = new ArrayList<>();
		
		while(!dq.isEmpty()) {
			
			list.add(dq.pollLast());
			
			if(!dq.isEmpty())
				
				list.add(dq.pollFirst());
		
		}
		
		return list;
	}
	
}
