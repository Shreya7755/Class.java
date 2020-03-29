import java.util.Scanner;
class Product
        {
                public static void main (String[]args)
                {
                        Scanner ip = new Scanner(System.in);
                        System.out.println("Enter any two integer to multiply");
                        int num1 = ip.nextInt();
                        int num2 = ip.nextInt();
                        int mul;
                        mul = num1 * num2;
                        System.out.println("The multiplication of two integer "+num1+ " and "+num2+ " is " +mul);
                }
        }

