import java.io.*;
class Bouncy_23
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("N = ");
        int n = Integer.parseInt(br.readLine());
        if(n < 0)
        {
            System.out.println("Not an increasing number.");
            System.out.println("Not a decreasing number.");
            System.out.println("Not a bouncy number.");
            return;
        }
        if(isIncreasing(n))
            System.out.println(n + " is an increasing number.");
        if(isDecreasing(n))
            System.out.println(n + " is a decreasing number.");
        if(!isIncreasing(n) && !isDecreasing(n))
            System.out.println(n + " is a bouncy number.");
    }
    public static boolean isIncreasing(int num)
    {
        int last = num % 10;
        boolean status = true;
        while(num != 0)
        {
            int digit = num % 10;
            if(digit > last)
            {
                status = false;
                break;
            }
            last = digit;
            num /= 10;
        }
        return status;
    }
    public static boolean isDecreasing(int num)
    {
        int last = num % 10;
        boolean status = true;
        while(num != 0)
        {
            int digit = num % 10;
            if(digit < last)
            {
                status = false;
                break;
            }
            last = digit;
            num /= 10;
        }
        return status;
    }
}
