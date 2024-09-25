import java.util.*;
class Average
{
    public static void main(String arg[])
    {
        int a,b,c;
        float avg;
        System.out.println("Enter a,b,c values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("Average number is" +avg);
    }
}