import java.util.ArrayList;
import java.util.List;

//Find the first non-repeating character in an array
public class FirstNonRepeatingChar {
	
	public void nonRepeatingchar(String input) {
		List<Character> list = new ArrayList<Character>();
		for(int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if(list.contains(temp)) {
				int index = list.indexOf(temp);
				list.remove(index);
			}
			else {
				list.add(temp);
			}
		}
		for(Character c : list) {
			System.out.println(c);
		}
		System.out.print(list.get(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabg";
		FirstNonRepeatingChar fChar = new FirstNonRepeatingChar();
		fChar.nonRepeatingchar(input);
	}

}
