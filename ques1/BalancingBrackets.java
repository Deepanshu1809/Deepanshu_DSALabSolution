package ques1;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {



	    static boolean BalancedBrackets(String bracketString)
	    {
	        
	        Stack<Character> st = new Stack<Character>();
	 
	        for (int i = 0; i < bracketString.length(); i++)
	        {
	            char bracket = bracketString.charAt(i);
	 
	            if (bracket == '(' || bracket == '[' || bracket == '{')
	            {
	               
	            	st.push(bracket);
	                continue;
	            }
	 
	          
	            if (st.isEmpty())
	                return false;
	            
	            char c;
	            
	            switch (bracket) {
	            
	            case '}':
	            	
	            	c = st.pop();
	                if (c == '(' || c == '[')
	                    return false;
	                break;
	                
	            case ')':
	            	
	                c = st.pop();
	                if (c == '{' || c == '[')
	                    return false;
	                break;
	 
	            case ']':
	                c = st.pop();
	                if (c == '(' || c == '{')
	                    return false;
	                break;
	            }
	        }
	 
	       
	        return (st.isEmpty());
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Please Enter the String to test whether it contains Balanced Brackets or  not !!!!!!!");
	        String bracketString = sc.nextLine();
	        		//"([[{}]])";
	         
	        Boolean ans;
	        
	        ans = BalancedBrackets(bracketString);
	        
	        if (ans)
	            System.out.println("The entered String has Balanced Brackets");
	        else
	            System.out.println("The entered Strings do not contain Balanced Brackets ");
	    }
}

