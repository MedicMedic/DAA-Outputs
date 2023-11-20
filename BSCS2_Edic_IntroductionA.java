package bscs2_Surname_IntroductionA;
import java.util.*;
public class BSCS2_Edic_IntroductionA 
{
	public static void main(String[]args)
		{
			@SuppressWarnings("resource")
			Scanner integer = new Scanner (System.in);
			int integer_value, reverse = 0, sum = 0, operation = 0, remainder = 0;
			
			System.out.print("INPUT INTEGER VALUE: ");
			integer_value = integer.nextInt();
			System.out.print("OPERATION: ");
			operation = integer.nextInt();
		
			boolean[] bool = new boolean[integer_value];
			
			switch (operation)
			{
				case 1: 
					while (integer_value > 0) 
					{
			            sum = sum + integer_value % 10;
			            integer_value = integer_value / 10;
			        }
			        System.out.println(sum);
			        break;
				case 2: 
					while (integer_value > 0) 
						{
				    		System.out.print(integer_value % 10);
				    		integer_value = integer_value / 10;
						}
					break;
				case 3:
					int intstorage = integer_value;
					while (intstorage != 0) 
					{
				      remainder = intstorage % 10;
				      reverse = reverse * 10 + remainder;
				      intstorage /= 10;
				    }
					 for (int counter = 0; counter < bool.length; counter++) 
					 {
				         bool[counter] = true;
				     }
				      for (int counter = 2; counter < Math.sqrt(integer_value); counter++) 
				      {
				         if (bool[counter] == true) 
				         {
				            for(int squared = (counter * counter); squared < integer_value; squared += counter) 
				            {
				               bool[squared] = false;
				            }
				         }
				      }
				      for (int i = 2; i< bool.length; i++) 
				      {
				         if(bool[i]==true) 
				         {
				             System.out.print("\t" + i);
				         }
				      }
				      break;
				case 4:
					intstorage = integer_value;
					while (intstorage != 0) 
					{
				      remainder = intstorage % 10;
				      reverse = reverse * 10 + remainder;
				      intstorage /= 10;
				    }
					if (reverse == integer_value)
					{
						System.out.print(reverse + " palindrome");
					}
					else
					{
						System.out.print(reverse + " not palindrome");
					}
					break;
				case 5:
					if (integer_value % 2 == 0)
					{
						System.out.print("Even");
					}
					else if (integer_value % 2 != 0)
					{
						System.out.print("Odd");
					}
					break;
				case 6:
					System.out.print("Marianne Edic");
					operation += 1;
			}
		}
}
