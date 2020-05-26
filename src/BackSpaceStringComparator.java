import java.util.Stack;

public class BackSpaceStringComparator {
	
    public boolean backspaceCompare(String input1, String input2) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for(int i = 0 ; i < input1.length(); i ++) {
        	if(input1.charAt(i) == '#' && stack1.size() != 0) {
        		stack1.pop();
        	}
        	else if(input1.charAt(i) != '#') {
        		stack1.push(input1.charAt(i));
        	}
        }
        for(int i = 0 ; i < input2.length(); i ++) {
        	if(input2.charAt(i) == '#' && stack2.size() != 0) {
        		stack2.pop();
        	}
        	else if(input2.charAt(i) != '#'){
        		stack2.push(input2.charAt(i));
        	}
        }
        if(stack1.equals(stack2)) {
        	return true;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackSpaceStringComparator sComparator = new BackSpaceStringComparator();
		System.out.println(sComparator.backspaceCompare("xywrrmp" ,"xywrrmu#p"));

	}

}
