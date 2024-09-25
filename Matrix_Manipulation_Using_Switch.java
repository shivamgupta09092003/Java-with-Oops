import java.util.*;
class Matrix_Manipulation_Using_Switch
{
    public static void main(String arg[])
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A array: ");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                a[i][j]=sc.nextInt();
        System.out.println("Enter B array: ");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                b[i][j]=sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multilplication");
        System.out.println("4. Transpose");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Addition");
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=a[i][j]+b[i][j];
                        System.out.print(c[i][j]+"\t");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Substraction");
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=a[i][j]-b[i][j];
                        System.out.print(c[i][j]+"\t");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Multiplication");
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=0;
                        for(k=0;k<3;k++)
                        {
                            c[i][j]=c[i][j]+a[i][k]*b[k][j];
                        }
                        System.out.print(c[i][j]+"\t");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Transpose");
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=a[j][i];
                        System.out.print(c[i][j]+"\t");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}