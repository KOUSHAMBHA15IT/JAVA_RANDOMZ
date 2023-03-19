import java.util.*;
class Mixer
{//start of class
    int n;//initialize
    int arr[];//initialize
    Mixer(int nn)
    {//parameterized constructor to assign n=nn
        n=nn;//to store the size of the array
        arr=new int[n];//to store the elements of an array
    }

    void accept()
    {//to accept the elements of the array in ascending order without any duplicate element.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+n+" number in ascending order : ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }

    Mixer mix(Mixer A)
    {//to merge the current object array elements with the parameterized array elements and return the resultant object.
        int size=this.n+A.n;//to store the size of the merged array
        Mixer B=new Mixer(size);
        int x=0, y=0;//variables
        //merging arrays
        for(int i=0;i<size;i++)
        {
            if(i<this.n)
                B.arr[i]=this.arr[x++];
            else
                B.arr[i]=A.arr[y++];
        }
        //sorting array elements
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(B.arr[j]>B.arr[j+1])
                {
                    int t=B.arr[j];//swaping
                    B.arr[j]=B.arr[j+1];//swaping
                    B.arr[j+1]=t;//swaping
                }
            }
        }
        return B;
    }

    void display()
    {//to display the elements of the array
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {//start of main()
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements for First Array : ");
        int n1=sc.nextInt();//to store number of elements for First Array
        System.out.print("Enter number of elements for Second Array : ");
        int n2=sc.nextInt();//to store number of elements for Second Array
        Mixer M1=new Mixer(n1);
        Mixer M2=new Mixer(n2);
        Mixer M3=new Mixer(n1+n2);
        System.out.println("Enter number for First Array: ");
        M1.accept();//to store elements for First Array
        System.out.println("Enter number for Second Array: ");
        M2.accept();//to store elements for Second Array
        M3=M1.mix(M2);
        System.out.println("First array : ");
        M1.display();//to display First Array
        System.out.println("Second array : ");
        M2.display();//to display Second Array
        System.out.println("Final array : ");
        M3.display();//to display Final Array
    }//end of main()
}//end of class
