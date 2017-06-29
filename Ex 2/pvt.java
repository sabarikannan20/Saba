class chk
{
    private chk(int x)
    {
        System.out.println("Default Constructor "+x);
    }
}
class pvt
{
     public static void main(String args[])
    {
        chk obj=new chk(5);
    }
}