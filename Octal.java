import java.util.Scanner;

public class Octal {
    public static void main(String arg[])
    {
        int n,x;
        String s="";
        int a[] = new int[20];
        System.out.println("Enter n value: ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        while (n>0)
        {
            x = n % 8;
            s=s+ String.valueOf(x);
            n=n/8;

        }
        for (int i=s.length()-1;i>-1;i--){
            System.out.print(s.charAt(i));
        }
    }
}