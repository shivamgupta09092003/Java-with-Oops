import java.util.*;
class Insert_An_Element_Into_An_Array
{
    public static void main(String arg[])
    {
        int a[]=new int[6],i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size: ");
        n=sc.nextInt();
        System.out.println("Enter Array Values: ");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter position to insert element:");
        int p=sc.nextInt();
        System.out.println("Enter element to insert");
        int x=sc.nextInt();
        for(i=(n-1);i>=(p-1);i--)
        {
            a[i+1]=a[i];
        }
        a[i+1]=x;
        System.out.println("After inserting element");
        for(i=0;i<n+1;i++)
            System.out.println(a[i]);
    }
}