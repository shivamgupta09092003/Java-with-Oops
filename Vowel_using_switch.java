import java.util.*;
class Vowel_using_switch
{
    public static void main(String arg[])
    {
        char a;
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        switch (a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}