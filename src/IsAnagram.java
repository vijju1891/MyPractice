import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
	
	public void isAnagram(String s1, String s2) {
		if(s1.length() != s2.length() || (s1.length() == 0 && s2.length() == 0 )) {
			System.out.println("not an anagram");
			return;
		}
		else {
			Map<Character, Integer> map1 = new HashMap<Character, Integer>();
			Map<Character, Integer> map2 = new HashMap<Character, Integer>();
			for(int i = 0; i < s1.length(); i++) {
				if(map1.containsKey(s1.charAt(i))){
					map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
				}
				else {
					map1.put(s1.charAt(i), 0);
				}
			}
			for(int i = 0; i < s2.length(); i++) {
				if(map2.containsKey(s2.charAt(i))){
					map2.put(s2.charAt(i), map2.get(s1.charAt(i))+1);
				}
				else {
					map2.put(s2.charAt(i), 0);
				}
			}
		
			for(Character c : map1.keySet()) {
				if(map1.get(c) != map2.get(c)) {
					System.out.println("not Anagram");
					return;
				}
			}
			System.out.println("anagram");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "";
		String input2 = "";
		IsAnagram isAnagram = new IsAnagram();
		isAnagram.isAnagram(input1, input2);
	}

}
