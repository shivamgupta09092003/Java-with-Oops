import java.util.*;
class Sum_of_Digits_Using_While
{
    public static void main(String arg[])
    {
        int a,s=0,i,x;
        System.out.println("Enter a value:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a>0)
        {
            x=a%10;
            s=s+x;
            a=a/10;
        }
        System.out.println("Sum of digits="+s);
    }
}