class chng
{
   chng()
    {
        this(5);
        System.out.println("Constructor chained ");
    }
    chng(int x)
    {
        System.out.println("Constructor called"+x);
    }
}
class Super extends chng
{
    Super()
    {
        super(5);
        System.out.println("super class called");
    }
    public static void main(String args[])
    {
        new Super();
    }
}