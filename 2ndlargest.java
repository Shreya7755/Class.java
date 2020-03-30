
import java.util.Arrays;
import java.util.Scanner;
class Sort
{
        public static void main(String[]args)
        {
                int i , temp;
                Scanner ip = new Scanner(System.in);
                System.out.println("Enter the size of array");
                int size = ip.nextInt();
                int []arr = new int [size];
                System.out.println("Enter the elements of an array");
                for(i = 0 ; i < size ; ++i)
                {
                        arr[i] = ip.nextInt();
                }
               // System.out.println(Arrays.toString(arr));
                for(i = 0 ; i < size ; i++)
                {
                        for(int j = i + 1 ; j < size ; j++)
                        {
                                if(arr[i] < arr[j])
                                {
                                        temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                }
                        }
                }
                System.out.println("Elements of array in descending order ");
                for(i = 0 ; i < size ; i++)
                {
                        System.out.println(+arr[i]);
                }
                System.out.println("The second largest element in the array "+arr[1]);
        }
}
