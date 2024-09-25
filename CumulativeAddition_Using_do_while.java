import java.util.*;
class CumulativeAddition_Using_do_while
{
    public static void main(String arg[])
    {
        int c,sum=0,count=0;
        System.out.println("Enter the Limits: ");
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        do {
            sum=sum+count;
            count++;
        }
        while (count<=c);
        System.out.println(sum);
    }
}