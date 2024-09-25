import java.util.*;
class Pattern2
{
    public static void main(String arg[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}