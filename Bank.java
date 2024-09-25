abstract class Bank       //Using Abstract class or Abstraction
{
    abstract int getRateOfInterest();
}
class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 7;
    }
}
class AXIS extends Bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}
class TestBank
{
    public static void main(String arg[])
    {
        Bank b1, b2;
        b1 = new SBI();
        System.out.println("Rate of Interest is= "+ b1.getRateOfInterest());
        b2 = new AXIS();
        System.out.println("Rate of Interest is= "+ b2.getRateOfInterest());
    }
}