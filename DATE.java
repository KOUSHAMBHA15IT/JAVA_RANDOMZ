import java.util.*;
class Date
{//starting of class
    public static boolean leap(int y)
    {
        if(y%400==0 || y%4==0 && y%100!=0)//checking
            return true;
        else
            return false;
    }

    public static void main()
    {//starting of main
        Scanner sc= new Scanner(System.in);
        String week[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int nod[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter the Date : (DD MM YYYY) : ");//asking user
        String day=sc.nextLine();
        int d=Integer.parseInt(day.substring(0,2));
        int m=Integer.parseInt(day.substring(3,5));
        int y=Integer.parseInt(day.substring(6));
        if(leap(y)==true)
            nod[2]=29;
        if(m>=1 && m<=12 && d>=1 && d<=nod[m])
        {
            int k=d;
            for(int i=1;i<m;i++)
                k+=nod[i];
            System.out.print("The day value is : "+k+" day and day is : ");//printing
            for(int i=1;i<y;i++)
            {
                if(leap(i)==true)//checking
                    k+=366;
                else
                    k+=365;
            }
            System.out.println(week[k%7]);
        }
        else
         System.out.println("Invalid Date...");
    }//closing of main
}//closing of class
