package array2D;
import java.util.Scanner;
public class Helpme 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		int[][] matrix;
		int row=1;
		int column=1;
		int arraysize=1;
		
		System.out.println("Enter the number of rows:");
		row = input.nextInt();
		System.out.println("Enter the number of columns:");
		column = input.nextInt();
		
		arraysize = row * column;
		
		matrix = new int [row+1][column+1];
		
		int counter = 1;
		int counterrow=0;
		int countercol=0;
		
		for (counter = 1; counter <= arraysize; counter++) 
		{
			if (counterrow < row)
			{
				matrix[counterrow][countercol] = counter;
				counterrow++;
			}
			else if (countercol < column)
			{
				countercol++;
				counterrow=0;
				matrix[counterrow][countercol] = counter;
				counterrow++;
			}
		}
		
		counterrow=row+1;
		countercol=0;
		for (counter = 1; counter <= arraysize; counter++) 
		{
			if (counterrow < row) 
			{
				System.out.print(matrix[counterrow][countercol] + " ");
				counterrow++;
			}
			else if (counter==1) 
			{
				System.out.print("Row #1: ");
				counter=0;
				counterrow=0;
			}
			else if (countercol < column) 
			{
				countercol++;
				System.out.print("\nRow #"+(countercol+1)+": ");
				counterrow = 0;
				System.out.print(matrix[counterrow][countercol] + " ");
				counterrow++;
			}
		}
		System.out.print("\n\n");

		counterrow=row-1;
		countercol=0;
		
		for (counter = 1; counter <= arraysize; counter++) 
		{
			if (countercol < column) 
			{
				System.out.print(matrix[counterrow][countercol] + "\t");
				countercol++;
			}
			else if (counterrow <= row) 
			{
				System.out.print("\n");
				counterrow--;
				countercol = 0;
				System.out.print(matrix[counterrow][countercol] + "\t");
				countercol++;
			}
		}
	}
}
