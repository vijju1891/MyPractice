import javax.swing.text.StyleContext.SmallAttributeSet;

public class EditsOnStrings {
	public void insertEdit(String input1, String input2) {
		int diff_length;
		int count =0;
		String greater;
		String shorter;
		 if(input1.length() > input2.length()) {
				diff_length = input1.length() - input2.length();
				greater = input1;
				shorter = input2;
			}
			else {
				diff_length = input2.length() - input1.length();
				greater = input2;
				shorter = input1;
			}
		 if(diff_length > 1) {
			 System.out.println("false");
			 return;
		 }
		 for(int i = 0, j = 0; j < shorter.length(); i++) {
			 if(greater.charAt(i) != shorter.charAt(j)) {
				 count++;
				 j--;
			 }				 
			 if(count > 1) {
				 System.out.println("false");
				 return;
			 }
				j++; 
		 }
		 if(count <= 1) {
			 System.out.println("true");
		 }
	}
	public boolean replaceEdit(String input1, String input2) {
		int count = 0;
		for(int i = 0; i < input1.length(); i++) {
			if(input1.charAt(i) != input2.charAt(i))
				count++;
		}
		if(count <=1)
			return true;
		else 
			return false;
	}
	public void isOneEdit(String input1, String input2) {
		int count = 0;
		int diff_length;

		if(input1.length() == input2.length()) {
			if(replaceEdit(input1, input2)) {
				System.out.println("true");
				return;
			}				
		}
		else {
			insertEdit(input1, input2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "3";
		String input2 = "";
		EditsOnStrings eStrings = new EditsOnStrings();
		eStrings.isOneEdit(input1, input2);
		
	}

}
