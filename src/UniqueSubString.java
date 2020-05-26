import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueSubString {
	
	public void findUniqueSubString(String s, int l) {
		
		Set<String> set = new HashSet<String>();
		int left = 0;
		int right = l;
		for(int i = 0; i < s.length() && right < s.length(); i++) {
			String sub = s.substring(left, right);
			System.out.println("substring= "+sub);
				set.add(sub);
				left++;
				right++;
		}
		
		for(String output : set) {
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueSubString uString = new UniqueSubString();
			String input = "";
			uString.findUniqueSubString(input, 3);
			
	}

}
