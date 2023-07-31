package Practice;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		double num;
		double square_num;
		double cube_num;
		double fourth_num;
		
		System.out.print("Please enter a Number: ");
		num = in.nextDouble();
		
		square_num = num * num;
		cube_num = square_num * num;
		fourth_num = cube_num * num;
		
		System.out.printf("\nSquare: %.2f\n", square_num);
		System.out.printf("Cube: %.2f\n",cube_num);
		System.out.printf("Fourth Power: %.2f\n", fourth_num);

	}

}
