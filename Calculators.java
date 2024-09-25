import java.util.*;
class Calculators
{
    public static void main(String arg[])
    {
        int x,y,z,ch;
        System.out.println("Enter the values of x and y: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        System.out.println("Enter your choices: ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                z= x+y;
                System.out.println("Sum= "+z);
                break;
            case 2:
                z= x-y;
                System.out.println("Sub= "+z);
                break;
            case 3:
                z= x*y;
                System.out.println("Mul= "+z);
                break;
            case 4:
                z= x/y;
                System.out.println("Div= "+z);
                break;
            case 5:
                z= x%y;
                System.out.println("Mod= "+z);
                break;
                default:
                    System.out.println("Invalid Input Please Try again");
        }
    }
}
