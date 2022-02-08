package sixthProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class sixthProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		
		int SizeofStack=scan.nextInt();
		
		System.out.println("Enter the input stack elements");
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<SizeofStack;i++) 
		{
			
			int element = scan.nextInt();
			stack.push(element);
		}
		
		List<Integer> li= GetList(stack);
		System.out.println(li);
	}
	
	public static List<Integer> GetList(Stack stack){
		
		List<Integer> list = new ArrayList<>();
		int size = stack.size();
		
		for(int i=0;i<size/2;i++) {
			
			list.add((Integer) stack.pop());
		}
		
		List<Integer> TemporaryList = new ArrayList<>();
		
		for(int i=size/2;i<size;i++) {
			
			TemporaryList.add((Integer) stack.pop());
		}
		
		Collections.reverse(TemporaryList);
		
		list.addAll(TemporaryList);
		
		return list;
		
	}
	
}
