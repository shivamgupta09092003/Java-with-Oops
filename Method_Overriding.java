class x{
    void abc(int x){
        System.out.println(x);
    }
}
class y{
    void abc(int x){
        System.out.println(x+20);
    }
}
class Method_Overriding {
    public static void main(String arg[]){
        x c=new x();
        y w=new y();
        c.abc(3);
        w.abc(3);
    }
}