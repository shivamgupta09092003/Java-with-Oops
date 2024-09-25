class Amazon                              //Using Single Inheritance
{
    void display1()
    {
        System.out.println("Class Amazon");
    }
}
class Flipkart extends Amazon
{
    void display2()
    {
        System.out.println("Class Flipkart");
    }
    public static void main(String args[])
    {
        Flipkart f=new Flipkart();
        f.display1();
        f.display2();
    }
}