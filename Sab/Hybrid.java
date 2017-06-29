interface A
{
    public void one();
}
interface B extends A
{
    public void two();
}
interface C extends A
{
    public void three();
}
class Hybrid implements B,C
{
    public void one()
    {
        System.out.println("This is the first interface");
    }
    public void two()
    {
        System.out.println("This is the second interface");
    }
    public void three()
    {
        System.out.println("This is the third interface");
    }
    public static void main(String args[])
    {
        Hybrid d=new Hybrid();
        d.one();
        d.two();
        d.three();
    }
}