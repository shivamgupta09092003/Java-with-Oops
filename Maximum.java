import java.util.*;
class Maximum
{
    public static void main(String args[])
    {
        int []a=new int[5];
        int i,j,t;
        System.out.println("Enter 5 Array Values: ");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;

                }
            }
        }
        System.out.println("Maximum= " +a[0]);
    }
}