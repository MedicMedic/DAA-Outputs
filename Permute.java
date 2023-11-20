package permute;

public class Permute 
{
	public static void main(String[] args) 
	{
		permute("", "abcdef");
	}

	public static void permute(String prefix, String str) 
	{
		int n = str.length();

		if (n == 0) 
		{
		      // If the string is empty, print the permutation
		      System.out.println(prefix);
		} 
		else 
		{
		      // Loop through each character in the string
			for (int i = 0; i < n; i++) 
			{
		        // Check if the current character is 'd'
		        if (str.charAt(i) == 'd') 
		        {
		          // If the current character is 'd', make sure it comes after 'a' in the permutation
		          if (prefix.indexOf('a') != -1) 
		          {
		            // If 'a' already exists in the permutation, add 'd' to the permutation and recurse
		            permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		          }
		        } 
		        else 
		        {
		          // If the current character is not 'd', add it to the permutation and recurse
		          permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		        }
		      }
		    }
		  }
		}


