public class CmdLine
{
    public static void main(String args[])
    {
        System.out.println(args[0]+args[1]);
        
    }
    protected void finalize()
    {
        System.out.println("hello i am destroy");
    }
}