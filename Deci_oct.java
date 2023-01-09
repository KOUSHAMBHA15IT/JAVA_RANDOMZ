//wap to convert from decimmal to octal
import java.util.*;
class Deci_Oct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal no.");
        int d=sc.nextInt();
        String oct= "";
        while(d>0)
        {
            int r=d%8;
            oct=r+oct;
            d=d/8;
        }
        System.out.print("Octal form:"+ oct);
    }
}
