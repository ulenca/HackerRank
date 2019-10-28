package interview;

public class RepeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		int n = 10;
		
		System.out.println("Number of a's = " + repeatedString(s,n));
	}

	
    static long repeatedString(String s, long n) {
    	
    	long result = 0;
    	int stringLenght = s.length();
    	System.out.println("string lenght: " + stringLenght);
    	
    	long aNumInOriginalString = 0;

    	for (int i =0; i<stringLenght; i++) {
    		if (s.charAt(i)=='a') {
    			aNumInOriginalString++;
    		}
    	}
    	
    	System.out.println("a number in original string: " + aNumInOriginalString); 
    	
    	long lenghtMultiplication = (long)Math.floor(n/stringLenght);
    	
    	System.out.println("Number of a in string lenght multiplication: " + lenghtMultiplication);
    	
    	long aNumInRemainingString = 0;
    	
    	for (int j=0;j<(n-lenghtMultiplication*stringLenght);j++) {
    		if (s.charAt(j)=='a') {
    			aNumInRemainingString++;
    		}
    	}
    	
    	result = aNumInOriginalString * lenghtMultiplication+aNumInRemainingString;
    	
    	System.out.println("a numbers i remaing string: "+ aNumInRemainingString);
    	
    	
    	return result;
    }
}
