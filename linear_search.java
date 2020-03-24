import java.util.Arrays;
import java.util.Scanner;
class Linear_search
{
	public static int search(int arr[] , int k)
	{
		int n = arr.length;
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i] == k)
			return i;
		}
		return -1;
	}	
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
		int result = search(arr , k);
		if(result  == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at index" + result);
	}
}
