import java.util.Scanner;

public class DiagonalAvg {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);

		int[][] numbers = new int[3][3];
		int userInput;
		int total = 0;
		int row = 0;
		int col = 0;

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Please enter a whole number: ");
				userInput = scan1.nextInt();
				numbers[r][c] = userInput;
			}
			
		}
		System.out.println();
		System.out.println("Here is a grid of the numbers you entered: ");
		System.out.println();
			
			int sum = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum = sum + numbers[i][i];
				for(int j = 0; j<numbers.length; j++){
				System.out.print(numbers[i][j] +"\t");
				//System.out.println();
			}
			System.out.println();
			}
			double average = (double) sum / numbers.length;
			
			System.out.println();
			System.out.println("Sum of the diagonal numbers (upper left to lower right): " + sum);
			System.out.println("The average of these numbers is: " + average);
		

		scan1.close();
	}

}
