
public class linSearch 
{
	int array[]; //This stores the user entry for the array
	int key;   //This stores the user entry for the key
	long time; //This stores the execution time for each of the called search methods
	
	public linSearch(int array[], int key)
	{
		//Constructor for user input array and key
		this.array = array;
		this.key = key;
	}
	
	public int linearSearch()
	{
		long beginTime = System.nanoTime();
		for (int i = 0; i < this.array.length; i++)
		{
			if (this.array[i] == key)
			{
				long finalTime = System.nanoTime();
				this.time = finalTime - beginTime;
				return i;
			}
		}
		return -1; //return -1 if key is not found
	}
	
	public int interpSearch()
	{
		long beginTime = System.nanoTime();
		int low = 0;
		int mid;
		int high = array.length - 1;
		int pos;
		
		while (low <= high)
		{
			//calculate the "probe" using the key to linearly interpolate
			pos = (key - array[low]) / (array[high] - array[low]);
			//calculate the middle value
			mid = low + ((high - low)*pos);
			if (key < array[mid])
			{
				high = mid - 1;
			}
			else if (key > array[mid])
			{
				low = mid + 1;
			}
			else
			{
				long finalTime = System.nanoTime();
				this.time = finalTime - beginTime;
				return mid;
			}
		}
		
		return -1; //return -1 if key is not found
	}
	
	public int improvedLinSearch()
	{
		long beginTime = System.nanoTime();
		for (int i = 0; i < this.array.length; i++)
		{
			//Search starting from first element for the key
			if (this.array[i] == key)
			{
				long finalTime = System.nanoTime();
				this.time = finalTime - beginTime;
				return i;
			}
			
			//Also, use i to search the other end of the array for the key
			if (this.array[this.array.length - 1 - i] == key)
			{
				long finalTime = System.nanoTime();
				this.time = finalTime - beginTime;
				return this.array.length - 1 - i;
			}
		}
		return -1; //return -1 if key is not found
	}
	
}
