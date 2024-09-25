import java.util.*;
class Greatest
{
    public static void main(String arg[])
    {
        int a,b;
        System.out.println("Enter a,b values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.println("A is Greatest");
        else
            System.out.println("B is Greatest");
    }
}