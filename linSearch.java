
public class linSearch 
{
	int array[];
	int key;
	long time;
	
	public linSearch(int array[], int key)
	{
		this.array = array;
		this.key = key;
	}
	
	public int search()
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
		return -1;
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
			pos = (key - array[low]) / (array[high] - array[low]);
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
		
		return -1;
	}
	
}
