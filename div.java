import java.util.Scanner;
class Div
        {
                public static void main (String[]args)
                {
                        Scanner ip = new Scanner(System.in);
                        System.out.println("Enter any two integer to divide");
                        int num1 = ip.nextInt();
                        int num2 = ip.nextInt();
                        int div;
                        div = num1 / num2;
                        System.out.println("The division of two integer "+num1+ " and "+num2+ " is " +div);
                }
        }
