/for input

import java.util.Arrays;
import java.util.Scanner;
class Input
{
	public static void main(String[]args)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = ip.nextInt();
		int []arr = new int [size];
		System.out.println("Enter the integer to check in an array");
		int k = ip.nextInt();
		System.out.println("Enter the elements of an array");
		for(int i = 0 ; i < size ; ++i)
		{
			arr[i] = ip.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}


