
public class CompressedString {
	public void compress(String input) {
		StringBuffer sBuffer = new StringBuffer();
		int count = 1;
		char temp = input.charAt(0);
		for(int i = 1; i < input.length(); i++) {
			 if(temp != input.charAt(i)) {
				 sBuffer.append(temp).append(count);
				 count = 1;
				 temp = input.charAt(i);
				 
			 }
			 else {
				 count++; 
			 }
			 			 if(input.length() == i+1) {
				 sBuffer.append(temp).append(count);
			 }
		}
		if(input.length() > sBuffer.length())
			System.out.println(sBuffer.toString());
		else
			System.out.println(input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aAbbdddddddddddwcC";
		CompressedString cString = new CompressedString();
		cString.compress(input);
	}

}
