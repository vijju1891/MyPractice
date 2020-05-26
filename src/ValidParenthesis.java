import java.util.Stack;

public class ValidParenthesis {
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for(int i =0 ; i < s.length(); i++) {
	        	if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
	        		stack.push(s.charAt(i));
	        	}
	        	else {
	        		if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
		        		char temp = stack.pop();
		        		if(s.charAt(i) == ')' && temp != '(') {
		        			return false;
		        		}
		        		else if(s.charAt(i) == ']' && temp != '[') {
		        			return false;
		        		}
		        		else if(s.charAt(i) == '}' && temp != '{') {
		        			return false;
		        		}
		        	}
	        	}
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "([)]";
		ValidParenthesis vParenthesis = new ValidParenthesis();
		System.out.println(vParenthesis.isValid(input));
	}

}
