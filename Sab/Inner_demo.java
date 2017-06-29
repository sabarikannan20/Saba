class outer
{
    private int c=100;
    class Inner
    {
        String ceo="jones";
        public void check()
        {
            System.out.println(c);
        }
    }
    void display()
    {
        Inner in=new Inner();
        in.check();
    }
}
public class Inner_demo
{
    public static void main(String args[])
    {
        outer ot=new outer();
        outer.Inner in=ot.new Inner();
        System.out.println(in.ceo);
        in.check();
        ot.display();
    }
}
    