public class MultiplicationTable {
	public static void main(String[] args) {
    	// Step 1: Declare and initialize the 2D array
    	int size = 8;
    	String[][] table = new String[size][size];

    	// Step 2: Populate the array with coordinated results
        String[] strN={"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] strM={"1", "2", "3", "4", "5", "6", "7", "8"};
    	for (int i = 0; i < size; i++) { // Loop over rows
        	for (int j = 0; j < size; j++) { // Loop over columns
            	table[i][j] = (strN[i]+""+strM[j]);
        	}
    	}

    	// Step 3: Print the chess table
    	for (int i = 0; i < size; i++) { // Loop over rows
        	for (int j = 0; j < size; j++) { // Loop over columns
            	System.out.print(table[i][j] + "\t"); // Print each element followed by a tab
        	}
        	System.out.println(); // Print a new line after each row
    	}
	}
}
