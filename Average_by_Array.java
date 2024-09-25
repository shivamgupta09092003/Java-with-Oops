import java.util.*;
class Average_by_Array
{
    public static void main(String arg[])
    {
        int[] a = new int[6];
        int i,sum=0;
        System.out.println("Enter 6 Array Values:");
        Scanner sc=new Scanner(System.in);
        for (i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        double average = (double) sum / a.length;
        System.out.println("Average of Array= "+average);
    }
}