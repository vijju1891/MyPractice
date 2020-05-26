
public class StringToIntegerAtoi {
	public int convertStringtoInteger(String input) {
		int output = 0;
		if(Character.isAlphabetic(input.charAt(0))){
			return 0;
		}
		else {
			String found_it = null;
			String[] parts = input.split(" ");
			for(int i = 0; i < parts.length; i++) {
				//System.out.println("="+parts[i]);
				if(!(parts[i].isEmpty())) {
						found_it = parts[i];
						break;
				}
				
			}
			
				if(Character.isAlphabetic(found_it.charAt(0)))
					return 0;
				else {
					double value = Long.parseLong(found_it);
					if(value < ((int)Math.pow(2, 31) - 1) && value >= (int)Math.pow(-2, 31)) {
						output = (int) value;
						return output;
					}
					else {
						if(value > (int)Math.pow(2, 31) - 1)
							return output = (int) Math.pow(2, 31) - 1;
						else if(value < Math.pow(-2, 31))
							return output = (int)Math.pow(-2, 31);
					}
				}
			
		}
		
		return output;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "   -2147483649 gth";		
		StringToIntegerAtoi sAtoi = new StringToIntegerAtoi();
		System.out.println(sAtoi.convertStringtoInteger(input));
	}

}
