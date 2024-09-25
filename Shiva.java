class Shiva                        //Using Multilevel Inheritance
{
    void display1()
    {
        System.out.println("Class Shiva");
    }
}
class Prakash extends Shiva
{
    void display2()
    {
        System.out.println("Class Prakash");
    }
}
class Agnik extends Prakash
{
    void display3()
    {
        System.out.println("Class Agnik");
    }
    public static void main(String arg[])
    {
        Agnik a=new Agnik();
        a.display1();
        a.display2();
        a.display3();
    }
}