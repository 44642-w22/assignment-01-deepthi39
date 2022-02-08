package fifthProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class fifthProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input string ");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		boolean IsBalanced= IsBalancedExp(str);
		
		System.out.println(IsBalanced);
	}
	
	public static boolean IsBalancedExp(String str){
		
		 Stack<Character> st = new Stack<>();
		 
	        for(int i=0;i<str.length();i++){
	            char ch = str.charAt(i);
	            char topElement = st.isEmpty()?'#':st.peek();
	            if(ch==')'){
	                if(topElement == '(')
	                    st.pop();
	                else
	                return false;
	            }
	            
	             else if(ch==']'){
	                if(topElement == '[')
	                    st.pop();
	                 else
	                return false;
	            }
	            
	             else if(ch=='}'){
	                if(topElement == '{')
	                    st.pop();
	                
	                 else
	                	 
	                return false;
	            }
	            
	            else
	                st.push(ch);
	            
	        }
	        
	        return st.isEmpty();
	}
	
}
