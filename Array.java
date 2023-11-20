package array;
import java.util.Scanner;
public class Array 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
	    int rows, cols;
	    int [][] plus;
	    int number;

	    System.out.print("Enter number of rows: ");
	    rows = input.nextInt();
	    System.out.print("Enter number of columns: ");
	    cols = input.nextInt();

	    plus = new int [rows][cols];
	    number = rows * cols;

	    int counter=0;
	    int counterrow=0;
	    int countercol=0;
	    while (counter <= number+3)
	    {
	        if (countercol<=cols-1) 
	        {
	        	if (countercol==(cols-1)/2)
	        	{
	        		plus[counterrow][countercol]=5;
	        	}
	        	else if (counterrow==(rows-1)/2)
	        	{
	        		plus[counterrow][countercol]=5;
	        	}
	        	else
	        	{
	        		plus[counterrow][countercol]=0;
	        	}
	        	System.out.print(plus[counterrow][countercol] + " ");
	        	countercol++;
	        }
	        else if (counterrow<=rows-1)
	        {
	        	System.out.print("\n");
	        	counterrow++;
	        	countercol=0;
	        }
	        counter++;
	    }
	    int cenrow = (rows-1)/2;
	    int cencol = (cols-1)/2;
	    System.out.print("\nThe biggest plus sign's center is at " + cenrow + ", " + cencol);
	}
}
