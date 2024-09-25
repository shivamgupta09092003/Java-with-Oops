class A                 //Using Hierarchical Inheritance
{
    A()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    B()
    {
        super();
        System.out.println("Class B");
    }
}
class C extends A
{
    C()
    {
        super();
        System.out.println("Class C");
    }
    public static void main(String args[])
    {
        B b=new B();
        C c=new C();
    }
}