package interview;

import java.util.Arrays;

public class SockMerchant {

	public static void main(String[] args) {

		int n = 10;
		int[] ari = {1,2,1,2,1,3,2,3,3,1};
		System.out.println("Number of pairs " + sockMerchant(n,ari));
		
		
	}
	
    static int sockMerchant(int n, int[] ar) {

    	int result = 0;
    	int pairCounter = 1;
    	
    	Arrays.sort(ar);
    	
    	for(int i = 1; i<=ar.length-1; i++) {
    		if(ar[i]==ar[i-1]) {
    			pairCounter++;
    		}else {
    			result = result + (int)Math.floor(pairCounter/2);
    			pairCounter=1;
    		}
    		
    	}
    	
    	if(pairCounter>1) {
			result = result + (int)Math.floor(pairCounter/2);
    	}
    	
    	return result;

    }

}
