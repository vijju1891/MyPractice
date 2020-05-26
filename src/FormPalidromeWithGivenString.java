import java.text.Normalizer.Form;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class FormPalidromeWithGivenString {

	public void formPalindrome(String input) {
		if(input.length() == 0) {
			return;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}
			else {
				map.put(temp, 1);
			}
		}
		int oddFlag = 0;
		for(Character c : map.keySet()) {
			if(map.get(c) % 2 != 0) {
				oddFlag++;
			}
			
		}
		if(oddFlag > 1)
			System.out.println("false");
		else
			System.out.println("true");
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ttpph";
		FormPalidromeWithGivenString pString = new FormPalidromeWithGivenString();
		pString.formPalindrome(input);

	}

}
