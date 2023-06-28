import java.util.Scanner;
import java.util.Arrays;

public class searchTest {

	public static void main(String[] args) 
	{
		int arrSize;
		int userArr[];
		int key;
		int keyIndex;
		linSearch linear;
		Scanner reader;
		reader = new Scanner(System.in);
		
		//Get user input for number of elements
	
		System.out.print("Please enter the number of elements: ");
		if (reader.hasNextInt())
		{
			arrSize = reader.nextInt();
		}
		else
		{
			arrSize = -1;
		}
		
		userArr = new int[arrSize];
		
		for (int i = 0; i < arrSize; i++)
		{
			System.out.print("Please enter element number " + i + " for the array: ");
			userArr[i] = reader.nextInt();
			System.out.println("");
		}
		
		System.out.print("Please enter the key to search for: ");
		key = reader.nextInt();
		
		Arrays.sort(userArr);
		
		linear = new linSearch(userArr, key);
		keyIndex = linear.search();
		System.out.println("**Linear Search**");
		if (keyIndex == -1)
		{
			System.out.println("Key not FOUND");
		}
		else
		{
			System.out.println("key FOUND at index: " + keyIndex);
			System.out.println("Runtime: " + linear.time);
		}
		
		
		keyIndex = linear.interpSearch();
		System.out.println("**Interpolation Search**");
		if (keyIndex == -1)
		{
			System.out.println("Key not FOUND");
		}
		else
		{
			System.out.println("key FOUND at index: " + keyIndex);
			System.out.println("Runtime: " + linear.time);
		}
		
		//keyIndex = linear.improvedLinSearch();
		//System.out.println("**Improved Linear Search**");
		//if (keyIndex == -1)
		//{
		//	System.out.println("Key not FOUND");
		//}
		//else
		//{
		//	System.out.println("key FOUND at index: " + keyIndex);
		//	System.out.println("Runtime: " + linear.time);
		//}
		
		reader.close();
		
		//Test block for array
		//for (int i = 0; i < arrSize; i++)
		//{
			//System.out.print(userArr[i]);
		//}
		//System.out.print(arrSize);
		//System.out.print("this is the key: " + key);
		
		
	}

}
