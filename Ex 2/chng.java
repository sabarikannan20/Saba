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
/*}
class chng

{*/
    public static void main(String args[])
    {
        new chng();
    }
}