
import java.util.Scanner;
class Compute
        {
                public static void main (String[]args)
                {
                        Scanner ip = new Scanner(System.in);
                        System.out.println("Enter the radius of the circle");
                        float radius = ip.nextFloat();
                        double pi = 3.14;
                        double area = pi * radius * radius;
                        double perimeter = 2 * pi * radius;
                        System.out.println("The area of the ciecle "+area);
                        System.out.println("The perimeter of the circle "+perimeter);
                }
        }
