import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Learn your squares and cubes!");
		
		boolean cont = true;
		
		while (cont) {
			
			System.out.print("Enter an integer: ");
			int number = scnr.nextInt();
			
			System.out.println("\nNumber\tSquared\tCubed");
			System.out.println("======\t======\t======");
			for (int i = 1; i < number + 1; i++) {
				System.out.println(i + "\t" + Math.pow(i, 2) + "\t" + Math.pow(i, 3));
			}
			
			System.out.println("\nMultiplication table!");
			
			for (int i=-1; i < number + 1; i++) { 
				
				if (i >= 1) {
					System.out.print(i + "  |\t");
				}
				for (int j = 1; j < number + 1; j++) {
					if (i == -1) {
						System.out.print("\t" + j + " ");
					} else if (i == 0) {
						System.out.print("\t= ");
					} else {
						System.out.print(i * j + "\t");
					}
				}
				System.out.println("\n");
			}
			
				
			System.out.print("Continue? (y/n): ");
			cont = scnr.next().startsWith("y");
			
		}
		
		System.out.print("Goodbye");
		scnr.close();
		
	}

}
