//wap to convert the number from decimal to binary
import java.util.*;
class Dec_bin
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int d=sc.nextInt();
        String b=" ";
        while(d>0)
        {
            int r=d%2;
            b=r+b;
            d=d/2;
        }
        System.out.println("Binary form  :"+b);
    }
}
