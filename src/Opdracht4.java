import java.util.Arrays;
import java.util.Random;

public class Opdracht4
{

	public static void main(String[] args)
	{
		//Maak een array
		int[] arr = new int[10];
		
		//Maak een array
		Random r = new Random();
		System.out.println("Willekeurige volgorde");
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = r.nextInt(100);
			System.out.println(arr[i]);
		}
		//Op volgorde zetten
		System.out.println("Goeie volgorde");
		 Arrays.sort(arr);
		 for (int i = 0; i < arr.length; i++)
			{
				
				System.out.println(arr[i]);
			}
		 
		
		
	}
}
