import java.util.*;
class FibonacciSeries_using_while
{
    public static void main(String arg[])
    {
        int a,b,s,n,count=0;
        a=0;
        b=1;
        System.out.println("Enter the Value: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(count<=n)
        {
            System.out.print(a+"\t");
            s=a+b;
            a=b;
            b=s;
            count++;
        }
    }
}