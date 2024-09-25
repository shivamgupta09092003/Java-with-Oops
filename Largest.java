import java.util.*;
class Largest
{
    public static void main(String arg[])
    {
        int a,b,c;
        System.out.println("Enter a,b,c values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println("A is Greatest");
        else if (b>c)
            System.out.println("B is Greatest");
        else
            System.out.println("C is Greatest");
    }
}