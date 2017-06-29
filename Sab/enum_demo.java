class enum_demo_test
{
    enum enum_demo_check{good,bad,average};
    enum_demo_check edc;
}
public class enum_demo
{
    public static void main(String args[])
    {
        enum_demo_test ed=new enum_demo_test();
        ed.edc=enum_demo_test.enum_demo_check.average;
        System.out.println("Checked is "+ed.edc);
    }
}