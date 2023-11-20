package bscs2_Surname_IntroductionA;
import java.util.*;
public class BSCS2_Edic_IntroductionB 
{
	@SuppressWarnings("resource")
	public static void main(String[]args)
	{
		Scanner word = new Scanner (System.in);
		Scanner integer = new Scanner (System.in);
		String string1, string2, compstr1 = "error", compstr2 = "error";
		int operation = 0, c = 0, stringselect1 = 0, stringselect2 = 0;
		
		System.out.print("INPUT STRING 1: ");
		string1 = word.nextLine();
		System.out.print("INPUT STRING 2: ");
		string2 = word.nextLine();
		System.out.print("OPERATION: ");
		operation = integer.nextInt();
		String string3 = string1;
		switch (operation)
		{
			case 1:
				string3 = string1;
				System.out.print(string3);
				break;
			case 2:
				System.out.print(string1+string2);
				break;
			case 3:
				System.out.print("select strings (1-3): ");
				stringselect1 = integer.nextInt();
				switch (stringselect1)
				{
					case 1:
						compstr1 = string1;
						break;
					case 2:
						compstr1 = string2;
						break;
					case 3:
						compstr1 = string3;
						break;
				}
				stringselect2 = integer.nextInt();
				switch (stringselect2)
				{
					case 1:
						compstr2 = string1;
						break;
					case 2:
						compstr2 = string2;
						break;
					case 3:
						compstr2 = string3;
						break;
				}
				if (compstr1 == compstr2)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
				break;
			case 4:
				String reverse = new StringBuilder(string1).reverse().toString();
				System.out.print(reverse);
				break;
			case 5:
				System.out.println("Uppercase: " + string1.toUpperCase());
				System.out.println("Lowercase: " + string1.toLowerCase());
				break;
			case 6:
				char a[]=string1.toCharArray();
			    for(c=0;c<a.length;c++)
			    {
			        if(a[c]>='A' && a[c]<='Z')
			        {
			             a[c]=(char)((int)a[c]+32);
			        }
			        else if(a[c]>='a' && a[c]<='z')
			        {
			             a[c]=(char)((int)a[c]-32);
			        }
			    }
				for(c=0;c<a.length;c++)
				{
					System.out.print(a[c]);
				}
				 break;
			case 7:
				System.out.print("Marianne Edic");
				break;
		}
	}
}
