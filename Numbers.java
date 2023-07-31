import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
			int num, square, cube, power;
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter a Number: ");
			num = input.nextInt();

			square = num * num;
			cube = square * num;
			power = cube * num;

			System.out.println("\nOutput Is = " + square + " ," + cube + " ," + power + "\n\n");

	}

}

