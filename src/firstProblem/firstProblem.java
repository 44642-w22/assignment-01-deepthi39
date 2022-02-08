package firstProblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class firstProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Numbers ");
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> li1= new LinkedList<>();
		
		for(int i=0;i<3;i++) {
			int element = scan.nextInt();
			li1.add(element);
		}
		
		List<Integer> li2 = GetPerfectNums(li1);
		
		System.out.println(li2);
	}
	
	public static List<Integer> GetPerfectNums(List<Integer> li1){
		
		List<Integer> li2 = new LinkedList<>();
		
		for(int i=0;i<li1.size();i++) {
			
			int number = li1.get(i);
			int sum=0;
			
			for(int j=1; j<number; j++)
			{
				if(number%j == 0)
				{
					sum += j;
				}
				
			}
			
			if(sum==number) {
				li2.add(number);
			}

		}
		
		return li2;
		
	}
	
}
