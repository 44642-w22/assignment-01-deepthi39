package secondProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class secondProblem {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of linked list");
		Scanner scan = new Scanner(System.in);
		
		int listsize=scan.nextInt();
		
		System.out.println("Enter the integers");
		
			List<Integer> List1 = new LinkedList<>();
			
			for (int i = 0; i < listsize; i++) {
				int element = scan.nextInt();
				List1.add(element);
			}
			
			System.out.println("Enter value for v");
			int v = scan.nextInt();
			
			List<List<Integer>> List2 = GetSumPair(List1, v);
			
			System.out.println(List2);
		}

		public static List<List<Integer>> GetSumPair(List<Integer> List1, int v) {
			
			List<List<Integer>> List2 = new ArrayList<>();
			
			for (int j = 0; j < List1.size() - 1; j++) {
				
				if (List1.get(j) + List1.get(j + 1) == v) {
					
					List2.add(new ArrayList<Integer>());
					List2.get(List2.size() - 1).add(List1.get(j));
					List2.get(List2.size() - 1).add(List1.get(j + 1));
				}
			}
			
			return List2;
		
	}
	
}
