import java.util.*;
class Prime_Numbers
{
    public static void main(String args[])
    {
        int i,j,counter=0,div=0;
        for(i=2;counter<10;i++)
        {
            div=0;
            for(j=2;j<i;j++)
            {
                if (i%j==0)
                {
                    div+=i;
                    break;
                }
            }
            if (div==0)
            {
                System.out.println(i);
                counter+=1;
            }
        }
    }
}