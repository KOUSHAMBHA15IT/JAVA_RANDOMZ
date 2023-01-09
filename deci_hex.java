//wap to covert decimal to hexadecimal form
import java.util.*;
class DeciHex
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int d=sc.nextInt();
        String hex="";
        while(d>0)
        {
            int r= d%16;
            if(r<=9)
            hex =r+hex;
            else
            hex= (char)(r+55)+hex;
            d=d/16;
        }
        
        System.out.println("Hexa-Decimal form:"+hex);
    }
}
