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
		
		//Get user input for all array elements
		for (int i = 0; i < arrSize; i++)
		{
			System.out.print("Please enter element number " + i + " for the array: ");
			userArr[i] = reader.nextInt();
			System.out.println("");
		}
		
		//Get user input for key
		System.out.print("Please enter the key to search for: ");
		key = reader.nextInt();
		
		//Sort the user entered array in ascending order
		Arrays.sort(userArr);
		
		//Construct a new linSearch object and pass user input key and array values to constructor
		linear = new linSearch(userArr, key);
		
		//Find the index at which the key appears using linear search and print out the index
		keyIndex = linear.linearSearch();
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
		
		//Find the index at which the key appears using interpolation search search and print out the index
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
		
		keyIndex = linear.improvedLinSearch();
		System.out.println("**Improved Linear Search**");
		if (keyIndex == -1)
		{
			System.out.println("Key not FOUND");
		}
		else
		{
			System.out.println("key FOUND at index: " + keyIndex);
			System.out.println("Runtime: " + linear.time);
		}
		
		reader.close();
		
		
		
	}

}
