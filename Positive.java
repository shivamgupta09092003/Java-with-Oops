import java.util.*;
class Positive
{
    public static void main(String arg[])
    {
        int a;
        System.out.println("Enter a value:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");
    }
}