import java.util.HashMap;
import java.util.Map;

public class TwoStringsOneSwap {
	public void isOneSwap(String input1, String input2) {
		
		if(input1.length() != input2.length())
			return;
		else {
			Map<Character, Integer> map1 = new HashMap<Character, Integer>();
			Map<Character, Integer> map2 = new HashMap<Character, Integer>();
			for(int i = 0; i < input1.length(); i++) {
				if(map1.containsKey(input1.charAt(i)))
					map1.put(input1.charAt(i), map1.get(input1.charAt(i)) + 1);
				else
					map1.put(input1.charAt(i),  1);
			}
			
			for(int i = 0; i < input2.length(); i++) {
				if(map2.containsKey(input2.charAt(i)))
					map2.put(input2.charAt(i), map2.get(input1.charAt(i)) + 1);
				else
					map2.put(input2.charAt(i),  1);
			}
			
			for(Character c : map1.keySet()) {
				if(map1.get(c) != map2.get(c))
					return;
			}
			int count= 0;
			for(int i = 0; i< input1.length(); i++) {
				if(input1.charAt(i) != input2.charAt(i))
					count++;
			}
			if(count == 2)
				System.out.println("true");
			else
				System.out.println("false");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "c";
		String input2 = "c";
		TwoStringsOneSwap tSwap = new TwoStringsOneSwap();
		tSwap.isOneSwap(input1, input2);
	}

}
