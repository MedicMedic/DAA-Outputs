package gui;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BruteForce
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		
		while (choice != 5)
		{
			System.out.println("\nWelcome to MELL Group 7!\nChoose from the following options:\n\t1. Knapsack\n\t2. Selection Sort\n\t3. Customers Delivery\n\t4. String Matching\n\t5. Exit");
			choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1: knapsack();
				break;
				case 2: selectionSort();
				break;
				case 3: custDel();
				break;
				case 4: stringMatching();
				break;
				case 5: exit();			
			}
		}
	}
	
	//Knapsack
	static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
 
    static void printknapSack(int W, double[] wt, int val[], int n)
    {
        int i;
		int w;
        int K[][] = new int[n + 1][W + 1];
 
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] +
                              K[i - 1][(int) (w - wt[i - 1])], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
 
        int res = K[n][W];
        System.out.println(res);
 
        w = W;
        for (i = n; i > 0 && res > 0; i--) {
            if (res == K[i - 1][w])
                continue;
            else 
            {	
            	System.out.print(wt[i - 1] + "   ");
                res = res - val[i - 1];
                w = (int) (w - wt[i - 1]);
            }
        }
    }
    
    public static void knapsack()
    {
    	int n;
    	Scanner input = new Scanner(System.in);
    	System.out.print("\nEnter the number of items : ");
    	n = input.nextInt();
    	int[] val = new int[n];
    	double[] wt = new double[n];
    	
    	int i;
    	System.out.print("\nEnter the item’s weight and its value : \n");
    		for(i = 0; i < n; i++)
    		{
    			System.out.print("Weight: ");
    			wt[i] = input.nextDouble();
    			System.out.print("Value: ");
    			val[i] = input.nextInt();
    		}
    		
    		int W;
    		System.out.print("\nEnter the capacity of the knapsack : ");
    		W = input.nextInt();
    		System.out.print("\nThe Maximum value in the knapsack is ");
    		printknapSack(W, wt, val, n);
    		System.out.println();
    }
    //Selection Sorting
    public static void selectionSort()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose one:\n\ta. Product Name\n\tb. Weight\n\tc. Amount");
		String choice = scanner.next();
		
		switch(choice)
		{
			case "a":
				nameSort();
				break;
			case "b":
				System.out.print("Enter number of items: ");
				int noItems = scanner.nextInt();
				
				double[] items = new double[noItems];
				
				System.out.println("Enter respective weights");
				for (int i = 0; i < noItems; i++) 
			    {
			      items[i] = scanner.nextDouble();
			    }
				selectionSortDouble(items);
				break;
			case "c":
				System.out.print("Enter number of items: ");
				int n = scanner.nextInt();
				
				int[] itemNames = new int[n];
				
				System.out.println("Enter respective amounts");
				for (int i = 0; i < n; i++) 
			    {
			      itemNames[i] = scanner.nextInt();
			    }
				selectionSortInt(itemNames);
				break;				
		}
		
	}
	public static void nameSort() 
	{
	    Scanner scanner = new Scanner(System.in);
	
	    // Ask the user to enter the number of names
	    System.out.print("Enter the number of names: ");
	    int n = scanner.nextInt();
	    scanner.nextLine();
	
	    // Create an array to store the names
	    String[] names = new String[n];
	
	    // Ask the user to enter the names
	    System.out.println("Enter the names:");
	    for (int i = 0; i < n; i++) 
	    {
	      names[i] = scanner.nextLine();
	    }
	
	    // Selection sort algorithm to sort the array of strings
	    for (int i = 0; i < n; i++) 
	    {
	      int minIndex = i;
	      for (int j = i + 1; j < n; j++) 
	      {
	        if (compareStrings(names[j], names[minIndex]) < 0) 
	        {
	          minIndex = j;
	        }
	      }
	      for (int m = 0; m < n; m++)
			{
				System.out.print(names[m] + " ");
				if (m == n - 1)
					System.out.println();
			}
	      if (minIndex != i) 
	      {
	        // Swap the names[i] and names[minIndex] elements
	        String temp = names[i];
	        names[i] = names[minIndex];
	        names[minIndex] = temp;
	      }
	    }
	
	    // Print the sorted list of strings
	    System.out.println("Sorted names:");
	    for (String sortedName : names) 
	    {
	      System.out.print(sortedName + " ");
	    }
	  }
	
	  public static int compareStrings(String str1, String str2) 
	  {
	    int len1 = str1.length();
	    int len2 = str2.length();
	    int lim = Math.min(len1, len2);
	    char v1[] = str1.toCharArray();
	    char v2[] = str2.toCharArray();
	
	    int k = 0;
	    while (k < lim) 
	    {
	      char c1 = v1[k];
	      char c2 = v2[k];
	      if (c1 != c2) 
	      {
	        return c1 - c2;
	      }
	      k++;
	    }
	    return len1 - len2;
	}
	  
	public static void selectionSortInt(int array[]) 
	{
		int size = array.length;

		for (int step = 0; step < size - 1; step++) 
		{
			int min_idx = step;
			for (int i = step + 1; i < size; i++) 
			{
				if (array[i] < array[min_idx]) 
				{
					min_idx = i;
				}
			}
			for (int m = 0; m < size; m++)
			{
				System.out.print(array[m] + " ");
				if (m == size - 1)
					System.out.println();
			}
			int temp = array[step];
			array[step] = array[min_idx];
			array[min_idx] = temp;
		}
		System.out.println("Result: ");
		for (int m = 0; m < size; m++)
		{
			System.out.print(array[m] + " ");
			if (m == size - 1)
				System.out.println();
		}
	}
	public static void selectionSortDouble(double items[]) 
	{
		DecimalFormat df = new DecimalFormat("#.#");
		int size = items.length;

		for (int step = 0; step < size - 1; step++) 
		{
			int min_idx = step;
			for (int i = step + 1; i < size; i++) 
			{
				if (items[i] < items[min_idx]) 
				{
					min_idx = i;
				}
			}
			for (int m = 0; m < size; m++)
			{
				System.out.print(df.format(items[m]) + " ");
				if (m == size - 1)
					System.out.println();
			}
			double temp = items[step];
			items[step] = items[min_idx];
			items[min_idx] = temp;
		}
		System.out.println("Result: ");
		for (int m = 0; m < size; m++)
		{
			System.out.print(df.format(items[m]) + " ");
			if (m == size - 1)
				System.out.println();
		}
	}
	//Customers Delivery
	public static void custDel() {

        int from, to;
        int distance[][] = {{0, 300, 150, 200},
                            {150, 0, 200, 300},
                            {100, 120, 0, 200},
                            {200, 200, 100, 0}};

        String deliverAdd[] = {"St.Peter", "St.John","Lanao","Maguindanao"};
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to Customers Delivery!");
        System.out.println();
        
        System.out.print("Customer's Name: ");
        String name = input.nextLine();
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.println();
        
        do{
        System.out.println("Delivery Address");
        System.out.println("   From: ");
        System.out.println("        [1] St.Peter");
        System.out.println("        [2] St.John");
        System.out.println("        [3] Lanao");
        System.out.println("        [4] Maguindanao");
        System.out.print("Enter the corresponding number: ");
        from = input.nextInt();
        System.out.println();
            if(from <= 0 || from >= 5)
            {
                System.out.println("!!Please choose from the listed only!!");
                System.out.println();
            }
        } while(from <= 0 || from >= 5);
        
        System.out.println();

        do{
        System.out.println("Delivery Address");
        System.out.println("   To: ");
        System.out.println("        [1] St.Peter");
        System.out.println("        [2] St.John");
        System.out.println("        [3] Lanao");
        System.out.println("        [4] Maguindanao");
        System.out.print("Enter the corresponding number: ");
        to = input.nextInt();
        System.out.println();
        if(to <= 0 || to >= 5)
            {
                System.out.println("!!Please choose from the listed only!!");
                System.out.println();
            }
        } while(to <= 0 || to >= 5);

        int fromAdd = from-1;
        int toAdd = to-1;

        System.out.println("DELIVERY INFORMATION");
        
        System.out.println();
        System.out.println("Customer's Name: " +name);
        System.out.println("Address: " +address);
        System.out.println();
        System.out.println("");
        System.out.println("     From:     " + deliverAdd[fromAdd]);
        System.out.println("     To:       " + deliverAdd[toAdd]);
        System.out.println("     Distance: " + distance[from-1][to-1]+"meters");
        System.out.println();
       }
	//String Matching
	public static void stringMatching() 
	{ 
	    Scanner input = new Scanner(System.in);
	    System.out.print("Input Address: ");
	    String address = input.nextLine();
	    System.out.print("Pattern: ");
	    String pattern = input.nextLine();
	        
	    matched(address, pattern);
	}

	static void matched(String address, String pattern )
	{
	    String[] words = address.split(" "); // split the address into words
	    int n = words.length;
	    int m = pattern.split(" ").length; // count the number of words in the pattern
	    int count = 0;
	        
	    for (int i = 0; i <= n - m; i++)
	    {
	        int j = 0;
	        while (j < m && pattern.split(" ")[j].equalsIgnoreCase(words[i + j]))
	        {
	            j++;
	        }
	        if (j == m)
	        {
	            count++;
	            System.out.println("Pattern found starting from word " + (i + 1)); // output position of the first word
	        }
	    }
	    if (count == 0)
	    {
	        System.out.println("Pattern not found in the address");
	    }
	}

    public static void exit() 
    {
    	System.out.print("Thank you!\n\nBy:\nMarianne Edic (Selection Sort and Compilation)\nJustin Llanera(String Matching)\nGinaline Lopez(Customers Delivery)\nErika Jozielle Merza(Knapsack)\n\nGROUP 7");
	}
}
