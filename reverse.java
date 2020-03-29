
import java.util.Scanner;
class Reverse
        {
                public static int reversed(int num)
                {
                        int rev_num = 0;
                        while(num > 0){
                                rev_num = rev_num * 10 + num % 10;
                                num = num/10;
                        }return rev_num;
                }
                public static void main(String[]args)
                {
                        Scanner ip = new Scanner(System.in);
                        System.out.println("Enter the num to be reverse");
                        int num = ip.nextInt();
                        System.out.println("The reversed num is "+reversed(num));
                }
        }

