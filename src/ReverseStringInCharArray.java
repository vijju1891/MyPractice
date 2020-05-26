
public class ReverseStringInCharArray {
	public void reverseString(char[] input) {
		char temp;
		int length = input.length;
		if(length > 0) {
			for(int i = 0, j = length-1 ; i < j; i++, j--) {
				temp = input[j];
				input[j] = input[i];
				input[i] = temp;
			}
		}		
		for(int i = 0; i < length; i++) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input = {'a', 'b', 'c', 'd', 'f', 'd'};
		ReverseStringInCharArray rArray = new ReverseStringInCharArray();
		rArray.reverseString(input);
	}

}
