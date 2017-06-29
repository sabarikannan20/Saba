class derived
{
    int res;
    void sum(int val1,int val2)
    {
        res=val1+val2;
        System.out.println("The sum of two number is: "+res);
    }
    void difference(int val1,int val2)
    {
        res=val1+val2;
        System.out.println("The difference between two number is: "+res);
    }
    void product(int val1,int val2)
    {
        res=val1*val2;
        System.out.println("The product of two number is: "+res);
    }
}
public class Single extends derived
{
    public static void main(String args[])
    {
        derived d=new derived();
        d.sum(10, 20);
        d.difference(20, 10);
        d.product(10, 20);
    }
}