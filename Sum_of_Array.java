import java.util.*;
class Sum_of_Array
{
    public static void main(String arg[])
    {
        int a[] =new int[6];
        int i,s=0;
        System.out.println("Enter a 6 Array Values:");
        Scanner sc=new Scanner(System.in);
        for (i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for (i=0;i<a.length;i++)
            s=s+a[i];
        System.out.println("Sum of Array Values="+s);
    }
}