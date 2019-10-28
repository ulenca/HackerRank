package interview;

import java.util.Arrays;

public class OrganizingContainerOfBalls {

	public static void main(String[] args) {

		int testContainer1[][] = {{1,3,1},{2,1,2},{3,3,3} };
		int testContainer2[][] = {{0,2,1},{1,1,1},{2,0,0} };

		System.out.println(organizingContainers(testContainer1));
	}
	
    static String organizingContainers(int[][] container) {
    	String result = "Impossible";
    	
    	int arrayDimension = container.length;
    	System.out.println("array dimension: " + arrayDimension);
    	
    	int[] volumeArray = new int[arrayDimension];
    			
    	int[] colorArray = new int[arrayDimension];
    	
    	System.out.println("Volume array:");
    	
    	for (int i=0; i<arrayDimension; i++) {
    		for(int j=0; j<arrayDimension;j++) {
    			volumeArray[i]=volumeArray[i]+container[i][j];
    		}
    		System.out.print(volumeArray[i]+", ");
    	}
    	System.out.println(" ");
    	System.out.println("Color array:");
    	
    	for (int i=0; i<arrayDimension; i++) {
    		for(int j=0; j<arrayDimension;j++) {
    			colorArray[i]=colorArray[i]+container[j][i];
    		}
    		System.out.print(colorArray[i]+", ");
    	}
    	
    	Arrays.sort(volumeArray);
    	Arrays.sort(colorArray);
    	
    	if(Arrays.equals(volumeArray, colorArray)) result = "Possible";
    	
    	System.out.println(" ");
    	return result;
    			
    }

}
