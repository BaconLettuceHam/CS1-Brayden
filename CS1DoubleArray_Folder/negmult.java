public class NegativeMultiplicationTable {
	public static void main(String[] args) {
    	// Step 1: Declare and initialize the 2D array
    	int size = 11;
    	int[][] table = new int[size][size];

    	// Step 2: Populate the array with multiplication results
    	for (int i = 0; i <= size-1; i++) { // Loop over rows
        	for (int j = 0; j <= size-1; j++) { // Loop over columns
            	table[i][j] = (i - 5) * (j - 5);
        	}
    	}

    	// Step 3: Print the multiplication table
    	for (int i = 0; i <= size-1; i++) { // Loop over rows
        	for (int j = 0; j <= size-1; j++) { // Loop over columns
            	System.out.print(table[i][j] + "\t"); // Print each element followed by a tab
        	}
        	System.out.println(); // Print a new line after each row
    	}
	}
}
