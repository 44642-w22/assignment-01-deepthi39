package fourthProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class fourthProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter the  numbers ");
		
		Scanner scan = new Scanner(System.in);
		
		List<String> li1= new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			String s = scan.next();
			li1.add(s);
		}
		
		List<String> li2 = GetSortedStrings(li1);
		System.out.println(li2);
	}
	
	public static List<String> GetSortedStrings(List<String> li1){
		
		List<String> li2 = new ArrayList<>();
		
		for(int i=0;i<li1.size();i++) {
			li2.add(li1.get(i));
		}
		
		Collections.sort(li2,(a,b)->a.length()-b.length());
		
		return li2;
	}
	
	
}
