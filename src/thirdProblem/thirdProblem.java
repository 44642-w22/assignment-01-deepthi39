package thirdProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class thirdProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of Arraylist");
		
		int arraysize = scan.nextInt();
		
		System.out.println("Enter the integers");
		
		List<Integer> li1= new ArrayList<>();
		
		for(int i=0;i<arraysize;i++) {
			
			int num = scan.nextInt();
			li1.add(num);
		}
		
		int element = GetMaximumNumber(li1);
		System.out.println(element);
	}
	
	public static int GetMaximumNumber(List<Integer> li1){
		int maximumNumber= Integer.MIN_VALUE;
		
		for(int i=0;i<li1.size();i++) {
			
			maximumNumber = Math.max(maximumNumber, li1.get(i));
		}
		
		return maximumNumber;
	}
	
	
}
