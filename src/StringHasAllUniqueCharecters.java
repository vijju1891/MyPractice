import java.util.HashSet;
import java.util.Set;

public class StringHasAllUniqueCharecters {
	public void hasAllUniuniqueChar(String input) {
		if(input.length() == 0)
			return;
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < input.length(); i++) {
			set.add(input.charAt(i));
		}
		if(set.size() == input.length()) {
			System.out.println("All unique");
		}
		else
			System.out.println("not unique");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "e43!";
		StringHasAllUniqueCharecters sCharecters = new StringHasAllUniqueCharecters();
		sCharecters.hasAllUniuniqueChar(input);
	}

}
