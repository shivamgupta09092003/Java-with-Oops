import java.util.*;
class Arithmetic_operation_using_switch
{
    public static void main(String arg[])
    {
        int a,b,c,ch;
        System.out.println("Enter a,b values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            c = a+b;
            System.out.println("Sum=" +c);
            break;
            case 2:
            c = a-b;
            System.out.println("Sub=" +c);
            break;
            case 3:
            c = a*b;
            System.out.println("Mul=" +c);
            break;
            case 4:
            c = a/b;
            System.out.println("Div=" +c);
            break;
            case 5:
            c = a%b;
            System.out.println("Mod=" +c);
            break;
            default:
                System.out.println("Invalid Input");
        }
    }
}