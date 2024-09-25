import java.util.*;
class Vowel
{
    public static void main(String arg[])
    {
        char a;
        System.out.println("Enter the value of a:");
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        if(a == 'a' ||a == 'e' ||a == 'i' ||a == 'o' ||a == 'u')
            System.out.println("Its a Vowel");
        else
            System.out.println("Its not a Vowel");
    }
}