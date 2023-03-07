public class Main {
	public static void main(String[] args) {
		/* --- 1 --- */
		System.out.println("PROBLEM 1:");

		int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
		// write code below that uses nested INDEX-BASED for loops
		// to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 2; j++)
				System.out.print(testArr1[i][j] + " ");
		System.out.println();

		System.out.println("---------");
		// now, write code below that uses nested ENHANCED for loops
		// to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

		for (int[] row : testArr1)
			for (int col : row)
				System.out.print(col + " ");
		System.out.println();

		System.out.println("---------");
		// lastly, write code below that uses nested INDEX-BASED for loops
		// to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				System.out.print(testArr1[j][i] + " ");
		System.out.println();

		/* --- 2 --- */
		System.out.println("---------");
		System.out.println("PROBLEM 2:");

		String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
		// write code below using a nested ENHANCED for loop to print each element in
		// testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish

		for (String[] row : testArr2)
			for (String col : row)
				System.out.println(col);

		System.out.println("---------");
		// write code below using an INDEX-BASED nested for loop to print each element in
		// testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 2; i++)
				System.out.println(testArr2[i][j]);
	}
}
