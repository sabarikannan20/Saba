class derived
{
    public int res;
    void sum(int val1,int val2)
    {
        res=val1+val2;
        System.out.println("The sum of two number is: "+res);
    }
    void difference(int val1,int val2)
    {
        res=val1-val2;
        System.out.println("The difference between two number is: "+res);
    }
    void product(int val1,int val2)
    {
        res=val1*val2;
        System.out.println("The product of two number is: "+res);
    }
}
class Single extends derived
{
    void division(float val1,float val2)
    {
        float res=val1/val2;
        System.out.println("The quotient of two number is: "+res);
    }
    
}
public class Hierarchical extends derived
{
    public static void main(String args[])
    {
        Single s=new Single();
        Hierarchical m=new Hierarchical();
        m.sum(10, 20);
        m.difference(20, 10);
        m.product(10, 20);
        //m.division(20,10);
       
        
        s.sum(10, 20);
        s.difference(20, 10);
        s.product(10, 20);
        s.division(20,10);
    }
}
