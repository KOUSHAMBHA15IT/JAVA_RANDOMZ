// wap to convert from Octal to decimal
import java.util.*;
class OctDeci
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal no.");
        int oct=sc.nextInt();
        int s=0,p=0;
        while(oct>0)
        {
            int d=oct%10;
            s=s+d*(int)Math.pow(8,p);
            p++;
            oct=oct/10;
        }
        System.out.println("Decimal form"+ ""+s);
    }
}
