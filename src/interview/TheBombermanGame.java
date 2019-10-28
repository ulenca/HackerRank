package interview;

import java.util.Arrays;
import java.util.Timer;

public class TheBombermanGame {

	public static void main(String[] args) {
		
    String[] grid1 = {	".......",
    					"...O...",
    					"....O..",
    					".......",
    					"OO.....",
    					"OO....."};
    String[] grid2 = {"O..OO........O..O........OO.O.OO.OO...O.....OOO...OO.O..OOOOO...O.O..O..O.O..OOO..O..O..O....O...O....O...O..O..O....O.O.O.O.....O.....OOOO..O......O.O.....OOO....OO....OO....O.O...O..OO....OO..O...O"};
    
    int time =181054341;
    String[] result = bomberMan(time, grid2);
    for(String i:result) {
    	System.out.println(i);
    	}
	}
	
	static String[] fillWithZeros(String[] grid) {
		
    	int columnNumber = grid[0].length();
    	int rowNumber = grid.length;
		for (int i=0; i<rowNumber; i++) {
			for (int j=0; j<columnNumber; j++) {
				if (j==0) {grid[i]="O";} 
				else {
				grid[i] = grid[i].concat("O");}
			}
		}
		return grid;
	}
	
	public static String replace(String str, int index, char replace){     
	    if(str==null){
	        return str;
	    }else if(index<0 || index>=str.length()){
	        return str;
	    }
	    char[] chars = str.toCharArray();
	    chars[index] = replace;
	    return String.valueOf(chars);       
	}
	
	static String[] emptyFieldsAfterExplosion(String[] previousGrid) {
		
    	int columnNumber = previousGrid[0].length();
    	int rowNumber = previousGrid.length;
    	
	    String[] result = fillWithZeros(previousGrid.clone());

		
		for(int i=0; i<rowNumber; i++) {
			for(int j=0; j<columnNumber; j++) {
	
				if(previousGrid[i].charAt(j)=='O') {

					
					if(i!=0) {
						result[i-1]=replace(result[i-1], j, '.');
					}
					if(i!=rowNumber-1) {
						result[i+1]=replace(result[i+1], j, '.');
					}
					if(j!=0) {
						result[i]=replace(result[i], j-1, '.');
					}
					if(j!=columnNumber-1) {
						result[i]=replace(result[i], j+1, '.');
					}
					result[i]=replace(result[i], j, '.');
					
				}
				
				

			}
		}
		return result;
	}
	
    static String[] bomberMan(int n, String[] grid) {

    	
    	if (n==1) return grid;
    	
    	if (n%2==0) {
    		
    		return fillWithZeros(grid);
    		
    	}
    	
    	if(n==3 || ((n-3)%4==0)){
    		grid = emptyFieldsAfterExplosion(grid).clone();
    	} else {
    		for(int i=3; i<=5; i+=2) {
        		grid = emptyFieldsAfterExplosion(grid).clone();
    		}
    		
    	}
    	
		
    	return grid;
    }

}


