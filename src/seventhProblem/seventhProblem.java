package seventhProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class seventhProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int SizeofQueue= scan.nextInt();
		System.out.println("Enter input Queue elements");
		
		Queue<Integer> dq = new LinkedList<>();
		
		for(int i=0;i<SizeofQueue;i++) {
			int element = scan.nextInt();
			dq.add(element);
		}

		int Number = GetDecimalNumber(dq);
		System.out.println(Number);
	}
	
	public static int GetDecimalNumber(Queue dq){
		
		int n=0;
		int size = dq.size();
		size--;
		int Base=2;
		
		while(!dq.isEmpty()) {
			
			int element = (int) dq.poll();
			n = n + (element*(int) Math.pow(Base, size));
			size--;
		}
		
		return n;
	}
	
	
}
