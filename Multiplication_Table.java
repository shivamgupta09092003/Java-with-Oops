import java.util.*;
class Multiplication_Table
{
    public static void main(String arg[])
    {
        int i,n,f;
        System.out.println("Enter Table Number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            f = n*i;
            System.out.println(n+"*"+i+"="+f);
        }
    }
}