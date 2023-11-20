package binarysearch;

public class BinarySearch 
{
	int binarySearch(int array[], int x, int low, int high) 
	{

	    if (high >= low) 
	    {
	    	int mid = low + (high - low) / 2;

	    	if (array[mid] == x)
	    		return mid;

	      // Search the left half
	    	if (array[mid] > x)
	    		return binarySearch(array, x, low, mid - 1);

	      // Search the right half
	    	return binarySearch(array, x, mid + 1, high);
	    }
	    return -1;
	}
}
