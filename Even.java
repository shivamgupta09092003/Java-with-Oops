import java.util.*;
class Even
{
    public static void main(String arg[])
    {
        int a;
        System.out.println("Enter a value:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}